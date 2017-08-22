package bmi;

public class ApplicationHelpers 
{
    public static void displayApplicationInformation(String appName, String week, String description)
    {
        StringBuilder prompt = new StringBuilder();

        prompt.append("*************************************************************");
        prompt.append("\nWelcome to the " + appName + " program");
        prompt.append("\nCIS355A: Week " + week);
        prompt.append("\nProgrammer: Tevis Boulware");
        prompt.append("\n" + description);
        prompt.append("\n*************************************************************");

        //OutputHelpers.showStandardDialog(prompt.toString(), appName);
        OutputHelpers.showConsole(prompt.toString());
    }
    
    public static void terminateApplication(String programName)
{
        StringBuilder prompt = new StringBuilder();

        prompt.append("\n*************************************************************");
        prompt.append("\nTerminating " + programName);
        prompt.append("\n*************************************************************\n");
        //OutputHelpers.showStandardDialog(prompt.toString(), programName);
        OutputHelpers.showConsole(prompt.toString());
        InputHelpers.closeScanner();
        System.exit(0);
    }
    public static Boolean continueProcessing(String operation)
    {
        Boolean keepGoing = false;
        String response = "";
        
        StringBuilder prompt = new StringBuilder();
        prompt.append("Process another " + operation + "?\n");
        prompt.append("Enter Y to continue, N to stop processing:");
        
        OutputHelpers.showOutputSeparator();
        System.out.print(prompt.toString());
	response = InputHelpers.getScannerInput("processing option");
        if (response.isEmpty() || response.length() > 1)
        {
            OutputHelpers.showConsole("Illegal response, continuing processing " + operation);
            keepGoing = true;
        }
        else 
        {
            if (response.toLowerCase().equals("n"))
            {
                keepGoing = false;
            }
            else
            {
                keepGoing = true;
            }
        }
        return keepGoing;
    }
}
