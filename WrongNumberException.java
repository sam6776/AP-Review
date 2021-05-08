package except;

public class WrongNumberException extends Throwable
{
	private static final long serialVersionUID = 5554673384700972685L;
	/** WrongNumberException
	 * constructor for exception
	 * @param str
	 */
	public WrongNumberException(String str)
	{
		super(str);
	}
	
}
