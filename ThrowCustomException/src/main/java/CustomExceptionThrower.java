
public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     * @throws CustomException
     */
    public void throwCustomException() throws CustomException{
        int numer = 12;
        int denom = 0;

            if (denom == 0){
                throw new CustomException("Divided by zero");
            }
            else{
                int quotient = (numer/denom);  
            }

    }

}
