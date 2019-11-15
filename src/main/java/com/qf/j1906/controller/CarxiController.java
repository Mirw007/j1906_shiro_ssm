package com.qf.j1906.controller;


import com.qf.j1906.pojo.Carxi;
import com.qf.j1906.service.CarxiService;
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

@Controller
public class CarxiController {
    Logger log= LogManager.getLogger(CarxiController.class);

    @Autowired
    private CarxiService carxiService;

    @RequestMapping("/{page}")
    public String showItem_list(@PathVariable("page") String page){
        return page;
    }

    @RequestMapping("/showCarxis")
    public String showCarxi(int carxiId ,Model model){
        if (carxiId!=0) {
            Carxi carxis=carxiService.getCarxiById(carxiId);
            model.addAttribute("result",carxis);
            return "cx_chexi_update";
        }
        return "error";
    }
    /**
     * 显示添加视图
     */
    @RequestMapping("/showCarxi")
    public String showCarxi_add()
    {
        return "cx_chexi_add";

    }
    /**
     * 显示添加
     */

    @RequestMapping(value = "/carxi/add",method = RequestMethod.POST)
    @ResponseBody
    public MsgResult addCarxi(Carxi carxi){
        log.info(carxi+"=========addcaixi===========");
            carxiService.addCarxi(carxi);
            MsgResult result = new MsgResult(200, "modify was success", null);
            return result;
    }
    /**
     * 删除一个车款信息
     * @param carxiId
     * @return
     */
     @RequestMapping( value = "/deletecarxiById",method = RequestMethod.GET)
    public String deleteById(int carxiId , Model model){
        log.info("==删除==="+carxiId);
        carxiService.deleteById(carxiId);
        log.info("====================================================");
        return "forward:/cx_chexi";
    }

    @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deleteList(@RequestBody String[] carxiId) {

         log.info("====String===================="+carxiId.toString());
        carxiService.delete(carxiId);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 按照车系id查询
     * @param carxiId
     * @param model
     * @return
     */

    @RequestMapping( value = "/showCarxiById/{carxiId}",method = RequestMethod.GET)
    public String showUpById(int carxiId ,Model model){
        if (carxiId!=0) {
          Carxi carxis=carxiService.getCarxiById(carxiId);
          model.addAttribute("result",carxis);
            return "cx_chexi_update";
        }
        return "error";
    }


    /**
     * 根据车系id修改
     * @param carxi
     * @return
     */
    @RequestMapping(value = "/carxi/update",method = RequestMethod.POST)
    public MsgResult updateCarxi(Carxi carxi){
        log.info(carxi+"=========addcaixi===========");
            carxiService.updateCarxiById(carxi);
            MsgResult result = new MsgResult(200, "modify was success", null);
            return result;

    }



    /**
     * 查询所有车系信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/cx_chexi",method = RequestMethod.GET )
    public String getCarxi(Model model){
        List<Carxi> Carxi= carxiService.getCarxi();
        log.info("==Carxi====="+Carxi+"====");
        if (Carxi!=null) {
            model.addAttribute("result",Carxi);
            return "cx_chexi";
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
    @RequestMapping(value = "/getCarxi",method = RequestMethod.POST )
    @ResponseBody
    public DataGridResult findItems(
            @RequestParam(value = "brandName" ,defaultValue = "") String brandName,
            @RequestParam(value = "carType" ,defaultValue = "") String carType,
            @RequestParam(value = "carxiName" ,defaultValue = "") String carxiName,
            @RequestParam(value = "page",defaultValue = "1") int page,
            @RequestParam(value = "rows",defaultValue = "10") int pageSize){
        log.info(brandName+"======="+carType+"===="+carxiName+"=-==="+page+"===="+pageSize);
        DataGridResult Carxis =carxiService.findItemsByPage(brandName,carType,carxiName,page,pageSize);
        log.info("============"+Carxis);
        return Carxis;
    }

}
