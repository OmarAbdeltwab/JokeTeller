import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by maom3 on 29-Jun-18.
 */

public class TestAsyncTask extends AndroidTestCase {

    public TestAsyncTask() {}

    @Test
    public void verify() throws ExecutionException, InterruptedException {
        MainActivity.EndpointsAsyncTask AT = new MainActivity.EndpointsAsyncTask();
        AT.execute( getContext());
        assertEquals( null, AT.get() );
        assertEquals( "", AT.get() );

    }


}
