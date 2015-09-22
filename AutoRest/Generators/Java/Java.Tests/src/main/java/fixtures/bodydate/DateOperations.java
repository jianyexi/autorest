/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import org.joda.time.LocalDate;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in DateOperations.
 */
public interface DateOperations {
    /**
     * The interface defining all the services for DateOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DateService {
        @GET("/date/null")
        Response getNull() throws ServiceException;

        @GET("/date/null")
        void getNullAsync(ServiceResponseCallback cb);

        @GET("/date/invaliddate")
        Response getInvalidDate() throws ServiceException;

        @GET("/date/invaliddate")
        void getInvalidDateAsync(ServiceResponseCallback cb);

        @GET("/date/overflowdate")
        Response getOverflowDate() throws ServiceException;

        @GET("/date/overflowdate")
        void getOverflowDateAsync(ServiceResponseCallback cb);

        @GET("/date/underflowdate")
        Response getUnderflowDate() throws ServiceException;

        @GET("/date/underflowdate")
        void getUnderflowDateAsync(ServiceResponseCallback cb);

        @PUT("/date/max")
        Response putMaxDate(@Body LocalDate dateBody) throws ServiceException;

        @PUT("/date/max")
        void putMaxDateAsync(@Body LocalDate dateBody, ServiceResponseCallback cb);

        @GET("/date/max")
        Response getMaxDate() throws ServiceException;

        @GET("/date/max")
        void getMaxDateAsync(ServiceResponseCallback cb);

        @PUT("/date/min")
        Response putMinDate(@Body LocalDate dateBody) throws ServiceException;

        @PUT("/date/min")
        void putMinDateAsync(@Body LocalDate dateBody, ServiceResponseCallback cb);

        @GET("/date/min")
        Response getMinDate() throws ServiceException;

        @GET("/date/min")
        void getMinDateAsync(ServiceResponseCallback cb);

    }
    /**
     * Get null date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    LocalDate getNull() throws ServiceException;

    /**
     * Get null date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNullAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get invalid date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    LocalDate getInvalidDate() throws ServiceException;

    /**
     * Get invalid date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get overflow date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    LocalDate getOverflowDate() throws ServiceException;

    /**
     * Get overflow date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get underflow date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    LocalDate getUnderflowDate() throws ServiceException;

    /**
     * Get underflow date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Put max date value 9999-12-31
     *
     * @param dateBody the LocalDate value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putMaxDate(LocalDate dateBody) throws ServiceException;

    /**
     * Put max date value 9999-12-31
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get max date value 9999-12-31
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    LocalDate getMaxDate() throws ServiceException;

    /**
     * Get max date value 9999-12-31
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Put min date value 0000-01-01
     *
     * @param dateBody the LocalDate value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putMinDate(LocalDate dateBody) throws ServiceException;

    /**
     * Put min date value 0000-01-01
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get min date value 0000-01-01
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    LocalDate getMinDate() throws ServiceException;

    /**
     * Get min date value 0000-01-01
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback);

}