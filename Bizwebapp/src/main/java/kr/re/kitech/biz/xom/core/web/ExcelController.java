/**
 * 
 */
package kr.re.kitech.biz.xom.core.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.xom.core.service.ExcelService;
import kr.re.kitech.biz.xom.core.vo.Fruit;

/**
 * 
 * @author James
 * @since 2022. 3. 14.
 */
 @Controller
public class ExcelController {

    /** MymenuService */
    @Resource(name = "excelService")
    private ExcelService excelService;	

 
    @ElService(key = "SvcDownToExcel")
	@RequestMapping(value = "SvcDownToExcel")
	@ElDescription(sub = "엑셀 다운로드 공통 서비스", desc = "엑셀 다운로드 공통 서비스")
	@ElValidator(errUrl = "")
    public ModelAndView download(Model model) {
        String[] names = {"자몽", "애플망고", "멜론", "오렌지"};
        long[] prices = {5000, 10000, 7000, 6000};
        int[] quantities = {50, 50, 40, 40};
        List<Fruit> list = excelService.makeFruitList(names, prices, quantities);
        
        SXSSFWorkbook workbook = excelService.excelFileDownloadProcess(list);
        
        Map<String,Object> elData = new HashMap<>();
        elData.put("workbook", workbook);
        elData.put("workbookName", "과일표");
        
        model.addAttribute(ElConstants.EL_DATA_STRING, elData);
        return new ModelAndView("excelDownloadView", elData);
        // return new ExcelDownloadView();
    }
}
