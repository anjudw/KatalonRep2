<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>LoginToSyscon_datadriven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>40</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>7f7c39e6-9889-4edf-aae0-67db37fc308b</testSuiteGuid>
   <testCaseLink>
      <guid>94b41313-eb3f-4723-89c3-5c1e5d8cc0bc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginScreenTest/LoginWithInvalidUser</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c156361a-fff1-42b6-8538-3a5bfa022816</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/LoginCredential</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>c156361a-fff1-42b6-8538-3a5bfa022816</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>InvalidUser</value>
         <variableId>fb9a3c83-32cb-47f7-b8c1-e9988c05ccee</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c156361a-fff1-42b6-8538-3a5bfa022816</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>b25be04c-749c-466e-b9e9-a303b5579d15</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>53dea441-d005-4c67-ad7c-b423bddc1959</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginScreenTest/LoginWithValidUser</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0a825f2d-c21c-45a3-81c5-ea281e42a8ad</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/LoginCredential</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0a825f2d-c21c-45a3-81c5-ea281e42a8ad</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>7d60ad8d-d98d-4ac5-82b7-94ad2088402e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0a825f2d-c21c-45a3-81c5-ea281e42a8ad</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>1b9975b6-a4b9-45af-80dd-30aefe82d57c</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
