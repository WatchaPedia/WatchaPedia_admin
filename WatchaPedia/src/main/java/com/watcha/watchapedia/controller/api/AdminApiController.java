package com.watcha.watchapedia.controller.api;

import com.watcha.watchapedia.controller.CrudController;
import com.watcha.watchapedia.model.entity.AdminUser;
import com.watcha.watchapedia.model.network.Header;
import com.watcha.watchapedia.model.network.request.AdminApiRequest;
import com.watcha.watchapedia.model.network.response.AdminApiResponse;
import com.watcha.watchapedia.service.AdminApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/admin")    // http://localhost:9090/api/admin
@RequiredArgsConstructor
public class AdminApiController extends CrudController<AdminApiRequest, AdminApiResponse, AdminUser> {
    private final AdminApiLogicService adminApiLogicService;

    @PostMapping("/idCheck")    // http://localhost:9090/api/admin/idCheck
    public Header<AdminApiResponse> idCheck(@RequestBody Header<AdminApiRequest> request) {
        Header<AdminApiResponse> result = adminApiLogicService.idCheck(request);
        System.out.println(result);
        return adminApiLogicService.idCheck(request);
    }

    @PostMapping("/employeeCheck")  // http://localhost:9090/api/admin/employeeCheck
    public Header<AdminApiResponse> employeeCheck(@RequestBody Header<AdminApiRequest> request) {
        return adminApiLogicService.employeeCheck(request);
    }

    @Override
    @PostMapping("/regist")    // http://localhost:9090/api/admin/regist
    public Header<AdminApiResponse> create(@RequestBody Header<AdminApiRequest> request) {
        return adminApiLogicService.create(request);
    }

    @Override
    public Header<AdminApiResponse> read(Long id) {
        return super.read(id);
    }

    @Override
    public Header<AdminApiResponse> update(Header<AdminApiRequest> request) {
        return super.update(request);
    }

    @Override
    public Header<AdminApiResponse> delete(Long id) {
        return super.delete(id);
    }
}