package com.watson.uitest.struct.element;

import com.watson.uitest.finder.WebDriverElementFinder;
import com.watson.uitest.struct.element.locator.Locator;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @author guochang.xie
 * @Description: TODO
 * @date 2019/4/262:28 PM
 */
@Setter
@Getter
@Slf4j
public class Element {

    private WebElement webElement;
    private String comment;
    private Locator locator=new Locator();

    public void click(){
        WebDriverElementFinder webDriverElementFinder=new WebDriverElementFinder(this);
        StringBuilder message = new StringBuilder(comment).append(":");
        if(webDriverElementFinder.isElementExist()){
            webElement.click();
            message.append("click 成功！");
        }else {
            message.append("click 失败！找不到元素！");
        }
        log.info(message.toString());

    }

    public void sendKeys(String value){
        WebDriverElementFinder webDriverElementFinder=new WebDriverElementFinder(this);
        StringBuilder message = new StringBuilder(comment).append(":");
        if(webDriverElementFinder.isElementExist()){
            webElement.sendKeys(value);
            message.append("sendKeys 成功！");
        }else {
            message.append("sendKeys 失败！找不到元素！");
        }
        log.info(message.toString());
    }


}


