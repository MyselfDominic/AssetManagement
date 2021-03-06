package Asset.Managment.Asset.controller;

import Asset.Managment.Asset.entity.Staff;
import AssetManagement.Asset.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {

    @Autowired
    WebService webService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("applicationName" , "Asset Management");
        return "index";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("applicationName" , "Asset Management");
        return "register";
    }

    @PostMapping("/submit")
    public String submit(Model model, @RequestParam("StaffId") String StaffId,@RequestParam("Name") String name,@RequestParam("Mobile") String mobile,@RequestParam("Email") String email, @RequestParam("Password") String password ) {

        Staff staff =  new Staff();
        staff.setStaffId(StaffId);
        staff.setEmail(email);
        staff.setMobile(mobile);
        staff.setPassword(password);
        staff.setName(name);

        webService.saveStaff(staff);

        return "submit";
    }

    @PostMapping("/loginverify")
    public String loginverify(Model model, @RequestParam("email") String email, @RequestParam("password") String password ) {


        Staff Staff = webService.verifyStaff(email, password);

        model.addAttribute("name" , Staff.getName());
        model.addAttribute("mobile" , Staff.getMobile());
        model.addAttribute("staffId" , Staff.getStaffId());

        return "loginverify";
    }


}
