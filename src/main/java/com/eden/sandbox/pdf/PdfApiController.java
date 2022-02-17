package com.eden.sandbox.pdf;

import com.eden.sandbox.aop.LogExecutionTime;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@Api(tags = {"PDF 관련 기능 Controller"})
@RequestMapping("/api/pdf")
@Log4j2
@RestController
public class PdfApiController {

  @ApiOperation(value = "PDF 정보 가져오기")
//  @ApiImplicitParam(name = "tagIds", value = "검색할 태그 ID를 담은 리스트", dataType = "list")
  @GetMapping("")
  @LogExecutionTime
  public String getPdf() {

    log.info("pdf");
    File file = new File("pdf파일의위치");
//    PDDocument document = PDDocument.load(file);
//    PDFRenderer pdfRenderer = new PDFRenderer(pdfDoc);

    return "pdf 파일";
  }

  @ApiOperation(value = "PDF 만들기")
  @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  @ApiImplicitParam(name = "fuke", value = "업로드 파일", dataType = MediaType.MULTIPART_FORM_DATA_VALUE)
  @LogExecutionTime
  public String uploadPdf(MultipartFile file) {
    log.info("params >> {}", file.getName());
//    File file = new File("./test.txt");
//    PDDocument document = PDDocument.load(file);
//    PDFRenderer pdfRenderer = new PDFRenderer(pdfDoc);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    String currentDate = simpleDateFormat.format(new Date());

    return "ok";
  }

  @ApiOperation(value = "조건에 맞는 게시글 목록을 반환하는 메소드")
//  @ApiImplicitParam(name = "tagIds", value = "검색할 태그 ID를 담은 리스트", dataType = "list")
  @GetMapping("/convert/{fileName}")
  public String convertPdf(@PathVariable String fileName) {

    //    File file = new File("pdf파일의위치");
//    PDDocument document = PDDocument.load(file);
//    PDFRenderer pdfRenderer = new PDFRenderer(pdfDoc);

    return "Response!!! >> " + fileName;
  }
}
