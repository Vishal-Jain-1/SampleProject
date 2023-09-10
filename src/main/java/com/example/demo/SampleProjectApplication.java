package com.example.demo;

import java.util.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.model.QuestionLevel;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;


@SpringBootApplication
public class SampleProjectApplication {
		
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SampleProjectApplication.class, args);

	/*	List<QuestionLevel> lql = new ArrayList<>();
		
			QuestionLevel q1 = new QuestionLevel(1L, 1001L, "Java", "What is oops?", "Easy");
			lql.add(q1);
			QuestionLevel q2 = new QuestionLevel(2L, 1203L, "Python", "What is tuple?","Hard");
			lql.add(q2);
			QuestionLevel q3 = new QuestionLevel(3L, 1425L, "Java", "Explain abstraction?", "Easy");
			lql.add(q3);
			QuestionLevel q4 = new QuestionLevel(4L, 1221L, "Angular", "Explain type of components?","Hard");
			lql.add(q4);
			QuestionLevel q5 = new QuestionLevel(5L, 1003L, "Java", "what is String pool?", "Easy");
			lql.add(q5);
			QuestionLevel q6 = new QuestionLevel(6L, 1501L, "Angular", "What is SPA?","Hard");
			lql.add(q6);
		
		try {
			String filepath = "C:\\Users\\User\\Documents\\spring tool suit\\sampleProject\\src\\main\\resources\\QuestionDifficultyLevelReport.jrxml";
			String outputfile = "C:\\Users\\User\\Documents\\report\\vishal.xlsx";
			

			JasperReport report = JasperCompileManager.compileReport(filepath);

			JRBeanCollectionDataSource datasource1 = new JRBeanCollectionDataSource(lql);

			Map<String, Object> parameter = new HashMap<String, Object>();
			parameter.put("image1",
					"C:\\Users\\User\\Documents\\spring tool suit\\interviewninja\\src\\main\\webapp\\content\\images\\logo.png");
			parameter.put("image2",
					"C:\\Users\\User\\Documents\\spring tool suit\\interviewninja\\src\\main\\webapp\\content\\images\\WissenLogoCut.png");
			parameter.put("tableparam" , datasource1);
			JasperPrint print = JasperFillManager.fillReport(report, parameter, new JREmptyDataSource());

			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setExporterInput(new SimpleExporterInput(print));
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputfile));

			exporter.exportReport();

			System.out.println("Successful");

		} catch (Exception e) {
			System.out.println("missing " + e);

		}

	}*/
	}
}
