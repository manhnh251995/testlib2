def call(URL){
         
        def url = "cd /home/manhnh && git clone " + URL;
        println url
        def proc = url.execute();
        def outputStream = new StringBuffer();
        proc.waitForProcessOutput(outputStream, System.err)
        return outputStream.toString();
         
         
    }
