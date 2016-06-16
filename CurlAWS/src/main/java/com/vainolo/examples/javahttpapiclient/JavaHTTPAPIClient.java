package com.vainolo.examples.javahttpapiclient;
 
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
 
public class JavaHTTPAPIClient {
  public void getQuestionsUsingUnirest() throws Exception {
	  
    /*HttpResponse<JsonNode> response = Unirest.get("https://api.stackexchange.com/2.2/questions").
        header("accept",  "application/json").
        queryString("order","desc").
        queryString("sort", "creation").
        queryString("filter", "default").
        queryString("site", "stackoverflow").
        asJson();*/
    
    HttpResponse<String> response = Unirest.post("https://gdapi.mcd.com/api/v1/jobs/ResizeEmrCluster/schedule")
    		  .header("content-type", "application/json")
    		  .header("authorization", "Basic NzI2NzBkODMtMDE1NC0xMDAwLWExYTgtZTI2YjYxMjQwZTc0OkZTZjY3YW8q")
    		  .header("cache-control", "no-cache")
    		  .header("postman-token", "059aac87-f304-4d33-150d-40b57375ecf0")
    		  .body("{\n \"clusterId\":\"j-MFWE4ZYFGDAY\",\n \"instanceGroupId\" : \"ig-3NAX5TPPO8Y2R\",\n \"instanceGroupType\" : \"task\",\n \"instanceGroupCount\" : \"30\"\n}")
    		  .asString();

    
    System.out.println(response.getBody());
  }
   
  public static void main(String args[]) throws Exception {
    JavaHTTPAPIClient client = new JavaHTTPAPIClient();
    client.getQuestionsUsingUnirest();
  }
}