package com.example.springbootstruts2.action;

import com.alibaba.fastjson2.JSON;
import com.example.springbootstruts2.vo.BaseResult;
import lombok.Data;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author hongcunlin
 */
@Controller
@Namespace("/word")
@Data
public class WordAction {
    /**
     * Struts2方法请求入参
     */
    private String word;

    /**
     * struts请求
     *
     * @throws IOException ex
     */
    @Action(value = "/get")
    public void get() throws IOException {
        ServletOutputStream os = ServletActionContext.getResponse().getOutputStream();
        BaseResult result = new BaseResult();
        result.setMsg(word);
        String json = JSON.toJSONString(result);
        os.write(json.getBytes(StandardCharsets.UTF_8));
    }
}
