def call(URL){
         
        def url = "git clone " + URL;
        def proc = url.execute();
        def outputStream = new StringBuffer();
        proc.waitForProcessOutput(outputStream, System.err)
        return outputStream.toString();
         
         
    }
