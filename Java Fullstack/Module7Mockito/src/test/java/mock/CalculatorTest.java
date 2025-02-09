package mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculatorTest {
    @Mock
    private DataService dataService;

    @InjectMocks
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddData() {
        // Arrange: Mock the behavior of dataService
        when(dataService.retrieveData()).thenReturn(new int[] {1, 2, 3});

        // Act: Call the method under test
        int result = calculator.addData();

        // Assert: Verify the output
        assertEquals(6, result);

        // Verify: Ensure retrieveData() was called exactly once
        verify(dataService, times(1)).retrieveData();
    }
    
    @Test
    void testWithArgumentCaptor() {
        ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);

        // Act: Trigger method that internally calls someMethod()
        calculator.processData(42);

        // Verify: Ensure someMethod() was called and capture its argument
        verify(dataService).someMethod(captor.capture());
        assertEquals(42, captor.getValue());
    }

}
