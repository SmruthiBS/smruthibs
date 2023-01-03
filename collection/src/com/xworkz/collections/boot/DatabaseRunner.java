package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collections.constant.Type;
import com.xworkz.collections.dto.DataBaseVendorDTO;

public class DatabaseRunner {

	public static void main(String[] args) {
		Collection<DataBaseVendorDTO>database=new ArrayList<DataBaseVendorDTO>();
		database.add(new DataBaseVendorDTO("oracle","oracle", 10, 0,Type.RELATIONAL_DATABASES ));
		database.add(new DataBaseVendorDTO("MySQL","oracle", 10, 0,Type.SQL_DATABASE ));
		database.add(new DataBaseVendorDTO("MongoDB","MongoDB Inc", 10, 0,Type.NOSQL_DATABASES ));
		database.add(new DataBaseVendorDTO("Microsoft SQL Server","microsoft", 25, 0,Type.SQL_DATABASE ));
		database.add(new DataBaseVendorDTO("mariaDB","MySQL", 10, 0,Type.SQL_DATABASE ));
		System.out.println("run 1 of stream");
	database.stream().map(dto->dto.getDevelopedBy()).collect(Collectors.toSet()).forEach(dto->System.out.println(dto.toUpperCase()));
	System.out.println("running 2 Stream");
	database.stream().filter(dto->dto.getLicensePrice()<100&&dto.getType().equals("SQL_DATABASE")).collect(Collectors.toSet()).forEach(data->System.out.println(data));
	database.stream().map(dto->dto.getType()).collect(Collectors.toSet()).forEach(type -> System.out.println(type));
	}

}
