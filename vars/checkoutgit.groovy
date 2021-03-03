def call(URL){
         
        def url = "sudo git clone " + URL;
        println url
        def proc = url.execute();
        def outputStream = new StringBuffer();
        proc.waitForProcessOutput(outputStream, System.out)
        return outputStream.toString();
         
         
    }
