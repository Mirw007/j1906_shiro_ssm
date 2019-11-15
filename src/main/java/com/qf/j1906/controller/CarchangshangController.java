package com.qf.j1906.controller;

import com.qf.j1906.pojo.Factory;
import com.qf.j1906.service.CarFactoryService;
import com.qf.j1906.vo.DataGridResult;
import com.qf.j1906.vo.MsgResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dafei 2019/11/8 18:40
 */
@Controller
@SessionAttributes("current_user")
public class CarchangshangController {
    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private CarFactoryService carFactoryService;


    /*===========================================车厂商视图========================================*/

    /*@RequestMapping(value = "/cx_pingpai",method = RequestMethod.GET )*/
    @RequestMapping(value = "/cx_changshang",method = RequestMethod.GET)
    public String cx_changshang(){
        return "cx_changshang";
    }

//    /**
//     * 重载分页
//     * @param page
//     * @param pageSize
//     * @return
//     */
//    @RequestMapping(value = "/cx_pingpaix",method = RequestMethod.POST )
//    @ResponseBody
//    public DataGridResult showPinpaix(@RequestParam(value="pinpainame",defaultValue = "") String pinpainame,
//                                      @RequestParam(value = "page",defaultValue = "1") int page,
//                                      @RequestParam(value = "rows",defaultValue = "10") int pageSize
//    ){
//        DataGridResult carbrands = carPinpaiService.findCarPinpaiByPage(pinpainame,page,pageSize);
//        if (carbrands!=null) {
//            return carbrands;
//        }
//        return null;
//    }

    /**
     * 分页查询
     * @param changshangname
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "cx_changshangx",method = RequestMethod.POST)
    @ResponseBody
    public DataGridResult showchangshang(@RequestParam(value="changshangname",defaultValue = "") String changshangname,
                                         @RequestParam(value = "page",defaultValue = "1") int page,
                                         @RequestParam(value = "rows",defaultValue = "10") int pageSize){
        DataGridResult carfactorys = carFactoryService.findCarFactoryByPage(changshangname, page, pageSize);
        if(carfactorys!=null){
            return carfactorys;
        }
        return null;

    }

    /**
     * 添加厂商视图
     * @return
     */
    @RequestMapping("/goaddchangshangwin")
    public String goaddchangshangwin(){
        return "cx_changshang_add";
    }

//    /**
//     * 添加品牌
//     * @param carbrand
//     * @return
//     */
//    @RequestMapping(value = "/addpinpaifun",method = RequestMethod.POST)
//    @ResponseBody
//    public MsgResult addpinpaifun(Carbrand carbrand){
////       调用业务方法写入数据库
//        carPinpaiService.addPinpai(carbrand);
//        MsgResult result = new MsgResult(200,"success",null);
//        return result;
//    }

    /**
     * 添加厂商
     * @param factory
     * @return
     */

    @RequestMapping(value = "/addchangshangfun",method = RequestMethod.POST)
    @ResponseBody
    public MsgResult addchangshangfun(Factory factory){
        carFactoryService.addChangshang(factory);
        MsgResult result = new MsgResult(200,"success",null);
        return result;

    }




    @RequestMapping(value = "/deletechangshangfun",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deletechangshangfun(@RequestBody String[] factoryIds){
        log.info("============================================================="+factoryIds.toString());
        carFactoryService.deleteChangshangById(factoryIds);
        return new ResponseEntity(HttpStatus.OK);
    }


}
