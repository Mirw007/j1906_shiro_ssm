package com.qf.j1906.controller;

import com.qf.j1906.pojo.Carbrand;
import com.qf.j1906.vo.DataGridResult;
import com.qf.j1906.vo.MsgResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dafei 2019/11/7 20:21
 */

@Controller
@SessionAttributes("current_user")
public class CarPingpaiController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    /*===========================================车品牌========================================*/

    @Autowired
    @Qualifier(value = "carPinpaiService")
    private com.qf.j1906.service.CarPinpaiService carPinpaiService;

    /**
     * 视图
     * @return
     */
    @RequestMapping(value = "/cx_pingpai",method = RequestMethod.GET )
    public String showPinpai(){
        return "cx_pingpai";
    }

    /**/
//    @RequestMapping(value = "/cx_pingpaix",method = RequestMethod.POST )
//    @ResponseBody
//    public List<Carbrand> showPinpaix(){
//        List<Carbrand> carbrands = carPinpaiService.findCarPinpai();
//        if (carbrands!=null) {
//            return carbrands;
//        }
//        return null;
//    }



    /**
     * 重载分页
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/cx_pingpaix",method = RequestMethod.POST )
    @ResponseBody
    public DataGridResult showPinpaix(@RequestParam(value="pinpainame",defaultValue = "") String pinpainame,
                                      @RequestParam(value = "page",defaultValue = "1") int page,
                                      @RequestParam(value = "rows",defaultValue = "10") int pageSize
    ){
        DataGridResult carbrands = carPinpaiService.findCarPinpaiByPage(pinpainame,page,pageSize);
        if (carbrands!=null) {
            return carbrands;
        }
        return null;
    }

    /**
     * 进入添加品牌视图
     * @return
     */
    @RequestMapping("/goaddpinpaiwin")
    public String goaddpinpaiwin(){
        return "cx_pingpai_add";
    }
//
//    /**
//     * 进入添加品牌
//     * @param brandName
//     * @param brandLog
//     * @param brandTime
//     * @return
//     */
//    @RequestMapping(value = "/addpinpaifun",method = RequestMethod.POST)
//    @ResponseBody
//    public MsgResult addpinpaifun(@RequestParam("brandName") String brandName,
//                                  @RequestParam("brandLog") String brandLog,
//                                  @RequestParam("brandTime")Date brandTime
//
//                                  ){
//        System.out.println("----------------------------------------------brandName:" +brandName+"----------------------------------------------brandLog:" +brandLog+"----------------------------------------------brandTime" +brandTime);
//        log.info("----------------------------------------------brandName:" +brandName+"----------------------------------------------brandLog:" +brandLog+"----------------------------------------------brandTime" +brandTime);
////       调用业务方法写入数据库
//        carPinpaiService.addPinpai(brandName,brandLog,brandTime);
//        MsgResult result = new MsgResult(200,"success",null);
//        return result;
//    }


    /**
     * 添加品牌
     * @param carbrand
     * @return
     */
    @RequestMapping(value = "/addpinpaifun",method = RequestMethod.POST)
    @ResponseBody
    public MsgResult addpinpaifun(Carbrand carbrand){
//       调用业务方法写入数据库
        carPinpaiService.addPinpai(carbrand);
        MsgResult result = new MsgResult(200,"success",null);
        return result;
    }

    /**
     * 删除品牌
     * @param brindIds
     * @return
     */
    @RequestMapping(path = "/deleteByBrandIds",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deleteByBrandIds(@RequestBody String[] brindIds){
        log.info("--------------string---------------------"+brindIds.toString());
        carPinpaiService.deleteCarbrandByIds(brindIds);
        return new ResponseEntity(HttpStatus.OK);
    }




    /**
     * 视图——修改
     * @return
     */
    @RequestMapping("/goupdatepinpaiwin")
    public String goupdatepinpaiwin(){
        return "cx_pingpai_update";
    }


    /**
     * 修改品牌
     * @param carbrand
     * @return
     */
    @RequestMapping(value = "/updatepinpaifun",method = RequestMethod.POST)
    @ResponseBody
    public MsgResult updatepinpaifun(Carbrand carbrand){
//       调用业务方法写入数据库
//        carPinpaiService.addPinpai(carbrand);
        MsgResult result = new MsgResult(200,"修改成功",null);
        return result;
    }

}
