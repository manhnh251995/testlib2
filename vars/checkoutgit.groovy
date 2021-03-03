def static executeCurlCommand(URL){
         
        def url = "curl " + URL;
        def proc = url.execute();
        def outputStream = new StringBuffer();
        proc.waitForProcessOutput(outputStream, System.err)
        return outputStream.toString();
}

