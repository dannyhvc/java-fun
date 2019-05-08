package Year_1.swing.D_H_PartC;

public interface D_H_TempConvertable
{
  final double ABS_ZERO_K = 0;
  final double ABS_ZERO_C = 0;
  final double ABS_ZERO_F = -459.66999999999996;

  double convertFtoC(double fTemp);
  double convertCtoF(double cTemp);
  double convertCtoK(double cTemp);
  double convertKtoC(double kTemp);
  double convertFtoK(double fTemp);
  double convertKtoF(double kTemp);

}
