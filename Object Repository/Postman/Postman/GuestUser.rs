<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GuestUser</name>
   <tag></tag>
   <elementGuidId>779dda3f-8dec-48d4-875f-450fb786f07a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;anonymousCartId\&quot; : \&quot;${anony_cartid}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>bf60c779-76be-4542-bd8e-f568ecc5f691</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>deviceId</name>
      <type>Main</type>
      <value>02-128254519</value>
      <webElementGuid>0adeec5b-b596-4c39-b4cb-2cbf84ee212c</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>brand</name>
      <type>Main</type>
      <value>LP</value>
      <webElementGuid>2a7f95e7-f4ea-4ce6-a77a-e984255c77d0</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>channel</name>
      <type>Main</type>
      <value>web</value>
      <webElementGuid>2a9bb6bc-d9a6-4aef-bf94-d308469ee99b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>correlationId</name>
      <type>Main</type>
      <value>0d8b1074-6f95-4366-b1cd-f90abb8a9557</value>
      <webElementGuid>2702064d-030a-4c37-9e24-7ef8d4fe3c3e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${host}/session/guest/create</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.anony_cartid</defaultValue>
      <description></description>
      <id>b94d3067-c56b-40d3-b510-4fd7519b246c</id>
      <masked>false</masked>
      <name>anony_cartid</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.host</defaultValue>
      <description></description>
      <id>a3455db8-f311-4d84-a7fe-189dfec00a6c</id>
      <masked>false</masked>
      <name>host</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.guestcarthost</defaultValue>
      <description></description>
      <id>29e47ae0-2c84-4999-ae87-e481498c40fb</id>
      <masked>false</masked>
      <name>guestcarthost</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
