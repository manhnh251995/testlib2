def call(URL){
         
        def url = "git clone " + URL;
        println url
        def proc = url.execute();
        def outputStream = new StringBuffer();
        proc.waitForProcessOutput(outputStream, System.out)
        return outputStream.toString();
         
         
    }
