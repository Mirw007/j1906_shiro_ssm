package com.qf.j1906.controller;

import com.qf.j1906.pojo.Carkuan;
import com.qf.j1906.service.CarkuanService;
import com.qf.j1906.vo.DataGridResult;
import com.qf.j1906.vo.MsgResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 飞
 */
@Controller
public class CarkuanController {
    Logger log= LogManager.getLogger(CarkuanController.class);

    @Autowired
    private CarkuanService carkuanService;

    /**
     * 显示添加视图
     */
    @RequestMapping("/showCarkuan")
    public String showCarkuan_add()
    {
        return "cx_chekuan_add";
    }
    /**
     * 显示添加
     */

    @RequestMapping(value = "/carkuan/add",method = RequestMethod.POST)
    @ResponseBody
    public MsgResult addCarxi(Carkuan carkuan){
        log.info(carkuan+"=========addcaixi===========");
        carkuanService.addCarxi(carkuan);
        MsgResult result = new MsgResult(200, "modify was success", null);
        return result;
    }

    /**
     * 查询所有车款信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/cx_cekuan",method = RequestMethod.GET )
    public String getCarkuan(Model model){
        List<Carkuan> carkuan= carkuanService.getCarkuan();
        log.info("==carkuan====="+carkuan+"====");
        if (carkuan!=null) {
            model.addAttribute("result",carkuan);
            return "cx_chekuan";
        }
        return "error";
    }

    /**
     * 分页查询
     * @param brandName
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/getCarkuan",method = RequestMethod.POST )
    @ResponseBody
    public DataGridResult findItems(
            @RequestParam(value = "brandName" ,defaultValue = "") String brandName,
            @RequestParam(value = "carType" ,defaultValue = "") String carType,
            @RequestParam(value = "carxinName" ,defaultValue = "") String carxinName,
            @RequestParam(value = "carxiName" ,defaultValue = "") String carxiName,
            @RequestParam(value = "page",defaultValue = "1") int page,
            @RequestParam(value = "rows",defaultValue = "10") int pageSize){
        log.info(brandName+"======="+carType+"===="+carxinName+"=-==="+page+"===="+pageSize);
        DataGridResult Carkuans =carkuanService.findItemsByPage(brandName,carType,carxinName,carxiName,page,pageSize);
        log.info("============"+Carkuans);
        return Carkuans;
    }

    /**
     * 删除一个车款信息
     * @param carkuanId
     * @return
     */
    @RequestMapping( value = "/deleteById/{carkuanId}",method = RequestMethod.GET)
    public String deleteById(int carkuanId ,Model model){
        log.info("==删除==="+carkuanId);
        if (carkuanId!=0){
            carkuanService.deleteById(carkuanId);
            List<Carkuan> carkuan= carkuanService.getCarkuan();
            log.info("==carkuan====="+carkuan+"====");
            if (carkuan!=null) {
                model.addAttribute("result",carkuan);
                return "cx_chekuan";
            }
            return "error";
        }
        return "error";
    }
    /**
     * 删除多个车款信息
     * @param carkuanId
     * @return
     */
 @RequestMapping(path = "/carkuan/delete", method = RequestMethod.DELETE)
 @ResponseBody
 public ResponseEntity deleteList(@RequestBody String[] carkuanId) {

     log.info("====String===carkuanId================="+carkuanId.toString());
     carkuanService.delete(carkuanId);
     return new ResponseEntity(HttpStatus.OK);
 }

    /**
     * 按照车款id查询
     * @param carkuanId
     * @param model
     * @return
     */

    @RequestMapping( value = "/showupdate/{carkuanId}",method = RequestMethod.GET)
    public String showUpById(int carkuanId ,Model model){
        if (carkuanId!=0) {
            Carkuan carkuans=carkuanService.getCarkuanById(carkuanId);
            model.addAttribute("result",carkuans);
            return "cx_chekuan_update";
        }
        return "error";
    }

    /**
     * 根据车系款id修改
     * @paramCarkuan
     * @return
     */
    @RequestMapping(value = "/carkuan/update",method = RequestMethod.POST)
    public MsgResult updateCarkuan(Carkuan carkuan) {
        log.info(carkuan + "=========addcaixi===========");
        carkuanService.updateCarkuanById(carkuan);
        log.info("==carkuan=====" + carkuan + "====");
        MsgResult result = new MsgResult(200, "modify was success", null);
        return result;

    }
}
