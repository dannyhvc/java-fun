/**
 * @author Daniel Herrera
 * @Date May 10, 2019.
 * @Purpose// This helper class is used to make it easy to make the neural network using
 * math commutative and logical functions.
 */
package nn.net_Math;

import java.math.BigDecimal;
import java.util.Random;

public class Math_transform
{

    private static Random random;
    private static long seed;

    public static BigDecimal Pi = new BigDecimal(
        "3.1415926535897932384626433832795028841971693993751058209749445" +
        "923078164062862089986280348253421170679821480865132823066470938" +
        "446095505822317253594081284811174502841027019385211055596446229" +
        "489549303819644288109756659334461284756482337867831652712019091" +
        "456485669234603486104543266482133936072602491412737245870066063" +
        "155881748815209209628292540917153643678925903600113305305488204" +
        "665213841469519415116094330572703657595919530921861173819326117" +
        "931051185480744623799627495673518857527248912279381830119491298" +
        "336733624406566430860213949463952247371907021798609437027705392" +
        "171762931767523846748184676694051320005681271452635608277857713" +
        "427577896091736371787214684409012249534301465495853710507922796" +
        "892589235420199561121290219608640344181598136297747713099605187" +
        "072113499999983729780499510597317328160963185950244594553469083" +
        "026425223082533446850352619311881710100031378387528865875332083" +
        "814206171776691473035982534904287554687311595628638823537875937" +
        "519577818577805321712268066130019278766111959092164201989000000"
    );

    public static BigDecimal Tau = Pi.multiply(new BigDecimal(2));

    public static BigDecimal e = new BigDecimal(
        "2.718281828459045235360287471352662497757247093699959574966" +
            "96762772407663035354759457138217852516642742746639193200305" +
            "99218174135966290435729003342952605956307381323286279434907" +
            "63233829880753195251019011573834187930702154089149934884167" +
            "50924476146066808226480016847741185374234544243710753907774" +
            "49920695517027618386062613313845830007520449338265602976067" +
            "37113200709328709127443747047230696977209310141692836819025" +
            "51510865746377211125238978442505695369677078544996996794686" +
            "44549059879316368892300987931277361782154249992295763514822" +
            "08269895193668033182528869398496465105820939239829488793320" +
            "36250944311730123819706841614039701983767932068328237646480" +
            "42953118023287825098194558153017567173613320698112509961818" +
            "81593041690351598888519345807273866738589422879228499892086" +
            "80582574927961048419844436346324496848756023362482704197862" +
            "32090021609902353043699418491463140934317381436405462531520" +
            "96183690888707016768396424378140592714563549061303107208510" +
            "38375051011574770417189861068739696552126715468895703503540"
    );


    public static Double dot(Double[] a, Double[] b)
    {
        Double dot_prod = 0.0;
        for (int i = 0; i < a.length; i++)
            dot_prod += a[i] * b[i];
        return dot_prod;
    }

    /**
     * @param a matrix
     * @param b matrix
     * @return c = a * b
     */
    public static double[][] dot(double[][] a, double[][] b)
    {
        int m1 = a.length;
        int n1 = a[0].length;
        int m2 = b.length;
        int n2 = b[0].length;

        if (n1 != m2)
            throw new RuntimeException("Illegal matrix dimensions.");

        double[][] c = new double[m1][n2];
        for (int i = 0; i < m1; i++)
            for (int j = 0; j < n2; j++)
                for (int k = 0; k < n1; k++)
                    c[i][j] += a[i][k] * b[k][j];

        return c;
    }

    /*OVERLOADED*/
    public static Double scalar_dot(Double[] a, Double b)
    {
        Double dot_prod = 0.0;
        for (var x : a)
            dot_prod += x * b;
        return dot_prod;
    }

    public static boolean getRandomBoolean()
    {
        return Math.random() < 0.5;
    }

    static
    {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    /**
     * Sets the seed of the pseudo-random number generator. This method enables
     * you to produce the same sequence of "random" number for each execution of
     * the program. Ordinarily, you should call this method at most once per
     * program.
     *
     * @param s the seed
     */
    public static void setSeed(long s)
    {
        seed = s;
        random = new Random(seed);
    }

    /**
     * Returns the seed of the pseudo-random number generator.
     *
     * @return the seed
     */
    public static long getSeed()
    {
        return seed;
    }

    /**
     * Returns a random real number uniformly in [0, 1).
     *
     * @return a random real number uniformly in [0, 1)
     */
    public static double uniform()
    {
        return random.nextDouble();
    }

    /**
     * Returns a random integer uniformly in [0, n).
     *
     * @param n number of possible integers
     * @return a random integer uniformly between 0 (inclusive) and {@code n}
     * (exclusive)
     * @throws IllegalArgumentException if {@code n <= 0}
     */
    public static int uniform(int n)
    {
        if (n <= 0)
            throw new IllegalArgumentException("argument must be positive: " + n);

        return random.nextInt(n);
    }

    /**
     * Returns a random long integer uniformly in [0, n).
     *
     * @param n number of possible {@code long} integers
     * @return a random long integer uniformly between 0 (inclusive) and
     * {@code n} (exclusive)
     * @throws IllegalArgumentException if {@code n <= 0}
     */
    public static long uniform(long n)
    {
        if (n <= 0L)
            throw new IllegalArgumentException("argument must be positive: " + n);

        long r = random.nextLong();
        long m = n - 1;

        // power of two
        if ((n & m) == 0L)
            return r & m;

        // reject over-represented candidates
        long u = r >>> 1;
        while (u + m - (r = u % n) < 0L)
            u = random.nextLong() >>> 1;

        return r;
    }

    /**
     * Returns a random integer uniformly in [a, b).
     *
     * @param a the left endpoint
     * @param b the right endpoint
     * @return a random integer uniformly in [a, b)
     * @throws IllegalArgumentException if {@code b <= a}
     * @throws IllegalArgumentException if {@code b - a >= Integer.MAX_VALUE}
     */
    public static int uniform(int a, int b)
    {
        if ((b <= a) || ((long) b - a >= Integer.MAX_VALUE))
            throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");

        return a + uniform(b - a);
    }

    /**
     * Returns a random real number uniformly in [a, b).
     *
     * @param a the left endpoint
     * @param b the right endpoint
     * @return a random real number uniformly in [a, b)
     * @throws IllegalArgumentException unless {@code a < b}
     */
    public static double uniform(double a, double b)
    {
        if (!(a < b))
            throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");

        return a + uniform() * (b - a);
    }

    /**
     * @param m
     * @param n
     * @return random m-by-n matrix with values between 0 and 1
     */
    public static double[][] random(int m, int n)
    {
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = uniform(0.0, 1.0);

        return a;
    }

    /**
     * Transpose of a matrix
     *
     * @param a matrix
     * @return b = A^T
     */
    public static double[][] T(double[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        double[][] b = new double[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[j][i] = a[i][j];

        return b;
    }

    /**
     * @param a matrix
     * @param b matrix
     * @return c = a + b
     */
    public static double[][] add(double[][] a, double[][] b)
    {
        int m = a.length;
        int n = a[0].length;
        double[][] c = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] + b[i][j];

        return c;
    }

    /**
     * @param a matrix
     * @param b matrix
     * @return c = a - b
     */
    public static double[][] subtract(double[][] a, double[][] b)
    {
        int m = a.length;
        int n = a[0].length;

        double[][] c = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] - b[i][j];

        return c;
    }

    /**
     * Element wise subtraction
     *
     * @param a scalar
     * @param b matrix
     * @return c = a - b
     */
    public static double[][] subtract(double a, double[][] b)
    {
        int m = b.length;

        int n = b[0].length;
        double[][] c = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a - b[i][j];

        return c;
    }

    /**
     * Element wise multiplication
     *
     * @param a matrix
     * @param x matrix
     * @return y = a * x
     */
    public static double[][] multiply(double[][] x, double[][] a)
    {
        int m = a.length;
        int n = a[0].length;

        if (x.length != m || x[0].length != n)
            throw new RuntimeException("Illegal matrix dimensions.");

        double[][] y = new double[m][n];

        for (int j = 0; j < m; j++)
            for (int i = 0; i < n; i++)
                y[j][i] = a[j][i] * x[j][i];

        return y;
    }

    /**
     * Element wise multiplication
     *
     * @param a matrix
     * @param x scaler
     * @return y = a * x
     */
    public static double[][] multiply(double x, double[][] a)
    {
        int m = a.length;
        int n = a[0].length;

        double[][] y = new double[m][n];
        for (int j = 0; j < m; j++)
            for (int i = 0; i < n; i++)
                y[j][i] = a[j][i] * x;

        return y;
    }

    /**
     * Element wise power
     *
     * @param x matrix
     * @param a scalar
     * @return y
     */
    public static double[][] power(double[][] x, int a)
    {
        int m = x.length;
        int n = x[0].length;

        double[][] y = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                y[i][j] = Math.pow(x[i][j], a);

        return y;
    }

    /**
     * @param a matrix
     * @return shape of matrix a
     */
    public static String shape(double[][] a)
    {
        int m = a.length;
        int n = a[0].length;

        return "(" + m + "," + n + ")";
    }

    /**
     * @param a matrix
     * @return sigmoid of matrix a
     */
    public static double[][] sigmoid(double[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        double[][] z = new double[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                z[i][j] = (1.0 / (1 + Math.exp(-a[i][j])));

        return z;
    }

    /**
     * Element wise division
     *
     * @param a scalar
     * @param x matrix
     * @return x / a
     */
    public static double[][] divide(double[][] x, int a)
    {
        int m = x.length;
        int n = x[0].length;

        double[][] z = new double[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                z[i][j] = (x[i][j] / a);

        return z;
    }

    /**
     * Element wise division
     *
     * @param A          matrix
     * @param Y          matrix
     * @param batch_size scalar
     * @return loss
     */
    public static double cross_entropy(int batch_size, double[][] Y, double[][] A)
    {
        int m = A.length;
        int n = A[0].length;
        double[][] z = new double[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                z[i][j] = (Y[i][j] * Math.log(A[i][j])) + ((1 - Y[i][j]) * Math.log(1 - A[i][j]));

        double sum = 0;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sum += z[i][j];

        return -sum / batch_size;
    }

    public static double[][] softmax(double[][] z)
    {
        double[][] zout = new double[z.length][z[0].length];
        double sum = 0.;

        for (int i = 0; i < z.length; i++)
            for (int j = 0; j < z[0].length; j++)
                sum += Math.exp(z[i][j]);

        for (int i = 0; i < z.length; i++)
            for (int j = 0; j < z[0].length; j++)
                zout[i][j] = Math.exp(z[i][j]) / sum;

        return zout;
    }

    /**
     * @param val of type T.
     */
    public static <T> void print(T val)
    {
        System.out.println(val);
    }

    public static double[] createArray(int size, double init_value)
    {
        if (size < 1)
            return null;

        double[] ar = new double[size];
        for (int i = 0; i < size; i++)
            ar[i] = init_value;

        return ar;
    }

    public static double[] createRandomArray(int size, double lower_bound, double upper_bound)
    {
        if (size < 1)
            return null;

        double[] ar = new double[size];
        for (int i = 0; i < size; i++)
            ar[i] = randomValue(lower_bound, upper_bound);
        return ar;
    }

    public static double[][] createRandomArray(int sizeX, int sizeY, double lower_bound, double upper_bound)
    {
        if (sizeX < 1 || sizeY < 1)
            return null;

        double[][] ar = new double[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++)
            ar[i] = createRandomArray(sizeY, lower_bound, upper_bound);

        return ar;
    }

    public static double randomValue(double lower_bound, double upper_bound)
    {
        return Math.random() * (upper_bound - lower_bound) + lower_bound;
    }

    public static Integer[] randomValues(int lowerBound, int upperBound, int amount)
    {

        lowerBound--;

        if (amount > (upperBound - lowerBound))
            return null;

        Integer[] values = new Integer[amount];
        for (int i = 0; i < amount; i++)
        {
            int n = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);

            while (containsValue(values, n))
                n = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
            values[i] = n;
        }

        return values;
    }

    public static <T extends Comparable<T>> boolean containsValue(T[] ar, T value)
    {
        for (int i = 0; i < ar.length; i++)
            if (ar[i] != null)
                if (value.compareTo(ar[i]) == 0)
                    return true;

        return false;
    }

    public static int indexOfHighestValue(double[] values)
    {
        int index = 0;
        for (int i = 1; i < values.length; i++)
            if (values[i] > values[index])
                index = i;

        return index;
    }

}//end Main class
