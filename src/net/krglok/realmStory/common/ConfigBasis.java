package net.krglok.realmStory.common;

/**
 * 
 * @author Windu
 * @create 25.03.2016
 * 
 * description:
 * This class hold the static constant and methods for the plugin and define
 * the configuration basics
 * 
 * The public final values are used in the hole Common package
 * - change the PLUGIN_NAME for your needs , it will used in message for 
 *   the pluginname
 *   
 * - CONFIG_VER , it will be used for check the config.yml
 *   this string must equal to the node value in config.yml
 *   
 * - CONFIG_VER_NAME  specify the node name in config.yml
 * - PLUGIN_NAME_NAME specify the node name in config.yml
 *
 */
public class ConfigBasis
{
	public static String CONFIG_VER = "1.0.0";
	public static final String CONFIG_VER_NAME = "config_ver";
	public static final String PLUGIN_NAME_NAME = "plugin_name";
	public static final String PLUGIN_NAME = "RealmStory";
	public static final String PLUGIN_VER = "0.1.1";
	
	
	public static double format2(double value)
	{
		int value100 = (int)(value * 100);
		return ((double)value100/100.0);
	}

	public static String setStrformat2(double value, int len)
	{
		value = format2(value);
		String in = String.valueOf(value);
		return setCharright(in, len,' ');
	}

	public static String setStrright(double value, int len)
	{
		String in = String.valueOf(value);
		return setCharright(in, len,' ');
	}


	public static String set0right(int value, int len)
	{
		String in = String.valueOf(value);
		return setCharright(in, len, '0');
	}
	
	public static String setStrright(int value, int len)
	{
		String in = String.valueOf(value);
		return setCharright(in, len, ' ');
	}

	public static String setStrright(String value, int len)
	{
		String in = String.valueOf(value);
		return setCharright(in, len, ' ');
	}

	private static String setCharright(String in, int len, char c)
	{
		char[] out = new char[len];
		for (int i = 0; i < out.length; i++)
		{
			out[i] = c;
		}
		if (len >= in.length())
		{
			char[] zw  = in.toCharArray();
			int zwl = zw.length;
			for (int i = 0; i < zw.length; i++)
			{
				out[len-i-1] = zw[zwl-i-1]; 
			}
		} else
		{
			char[] zw  = in.toCharArray();
			int zwl = zw.length;
			if (zw.length <= out.length)
			{
				for (int i = 0; i < out.length; i++)
				{
					out[len-i] = zw[zwl-i]; 
				}
			} else
			{
				out[0] = '?';
				out[1] = '?';
			}
		}
		return String.valueOf(out);
	}



	
}
