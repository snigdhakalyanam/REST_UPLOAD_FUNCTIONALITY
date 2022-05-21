package com.simplilearn.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadDownloadController {

	
	@RequestMapping(value="/upload", method=RequestMethod.POST, consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileupload(@RequestParam("file")MultipartFile file) throws IOException {
		
		File convFile = new File("/Users//Desktop/tmp/"+file.getOriginalFilename());
				convFile.createNewFile();
				
				try (FileOutputStream fos = new FileOutputStream(convFile)) {
					fos.write(file.getBytes());
				}
						return "File Uploaded Succesfully";
		
		
		
		
	}
	
	
	
	
}
