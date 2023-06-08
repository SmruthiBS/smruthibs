package com.xworkz.smruthi_xworkz.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ImageController {
public ImageController() {
	log.info("created "+this.getClass().getSimpleName());
}
@PostMapping("/upload")
public String onupload(@RequestParam("chitra") MultipartFile multipartFile)throws IOException {
	log.info("multipartfile "+multipartFile);
	log.info(multipartFile.getOriginalFilename());	
	log.info(multipartFile.getContentType());	
	log.info("filesize "+multipartFile.getSize());	
	log.info("bytes "+multipartFile.getBytes());	
byte[] bytes=multipartFile.getBytes();
Path path=Paths.get("D:\\zoo-files\\"+ multipartFile.getOriginalFilename());
Files.write(path, bytes);
return "ImageUpload";
}
}
