package org.littuss.hrManagementApp.assetController;

import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.littuss.hrManagementApp.assetService.SecondFloorAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/assetsecondfloor")

public class SecondFloorAssetController {
	
	@Autowired

	private SecondFloorAssetService asc;
	
	@PostMapping("/register")
	public SecondFloorAssetEntity saveAssetRegister(@RequestBody SecondFloorAssetEntity AssetRegister) {
	 	return asc.save(AssetRegister);
}
	
	

}
