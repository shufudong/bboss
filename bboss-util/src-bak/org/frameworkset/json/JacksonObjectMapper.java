package org.frameworkset.json;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;

public interface JacksonObjectMapper {

	<T> T json2Object(String jsonString, Class<T> toclass);

	<T> T json2Object(String jsonString, Class<T> toclass, boolean ALLOW_SINGLE_QUOTES);
	//	  public   <T> T json2Object(String jsonString,TypeReference<T> ref) {
	//			return json2Object(jsonString,ref,true);
	//			
	//		
	//		}
	//	  
	//	  public   <T> T json2Object(String jsonString,TypeReference<T> ref,boolean ALLOW_SINGLE_QUOTES) {
	//			// TODO Auto-generated method stub
	//
	////			String jsonString = "[{'from_date':'2001-09-21','to_date':'2011-04-02','company':'人寿保险','department':'xxx','position':'主管' },{'from_date':'0002-12-01','to_date':'2011-04-02', 'company':'人寿保险','department':'xxx','position':'主管' }]";
	//			ObjectMapper mapper = new ObjectMapper();
	//			mapper.configure(Feature.ALLOW_SINGLE_QUOTES, ALLOW_SINGLE_QUOTES); 
	//			try {
	//				T value = mapper.readValue(jsonString, ref);
	//				return value;
	//				
	//				
	//			} catch (Exception e) {
	//				throw new IllegalArgumentException(jsonString,e);
	//			}
	//			
	//		
	//		}

	String object2json(Object object);

	String object2json(Object object, boolean ALLOW_SINGLE_QUOTES);

	void object2json(Object object, File writer);

	void object2json(Object object, File writer, boolean ALLOW_SINGLE_QUOTES);

	void object2json(Object object, OutputStream writer);

	void object2json(Object object, OutputStream writer, boolean ALLOW_SINGLE_QUOTES);

	void object2json(Object object, Writer writer);

	void object2json(Object object, Writer writer, boolean ALLOW_SINGLE_QUOTES);

	byte[] object2jsonAsbyte(Object object);

	byte[] object2jsonAsbyte(Object object, boolean ALLOW_SINGLE_QUOTES);

}