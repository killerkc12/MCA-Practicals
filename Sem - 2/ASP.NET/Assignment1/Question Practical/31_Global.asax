<%@ Application Language="C#" %>

<script runat="server">

    void Application_Start(object sender, EventArgs e) 
    {
        // Code that runs on application startup
        Application["UsersCount"] = 0;

    }
    
    void Application_End(object sender, EventArgs e) 
    {
        //  Code that runs on application shutdown

    }
        
    void Application_Error(object sender, EventArgs e) 
    { 
        // Code that runs when an unhandled error occurs

    }

    void Session_Start(object sender, EventArgs e) 
    {
        // Code that runs when a new session is started
        Application.lock();
        Application["UsersCount"] = (int)Application["UsersCount"] + 1;
        Application.unlock();
    }

    void Session_End(object sender, EventArgs e) 
    {
        Application.lock();
        Application["UsersCount"] = (int)Application["UsersCount"] - 1;
        Application.unlock();
    }
       
</script>
