//THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.opentripplanner.ext.legacygraphqlapi.generated;

import org.opentripplanner.model.Agency;
import org.opentripplanner.ext.legacygraphqlapi.model.LegacyGraphQLRouteTypeModel;
import org.opentripplanner.routing.alertpatch.TransitAlert;
import org.opentripplanner.routing.vehicle_parking.VehicleParking;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalPlace;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStationUris;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStation;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalVehicle;
import org.opentripplanner.routing.vehicle_rental.VehicleRentalStationUris;
import org.opentripplanner.routing.vehicle_parking.VehicleParking;
import org.locationtech.jts.geom.Coordinate;
import org.opentripplanner.api.resource.DebugOutput;
import org.opentripplanner.routing.graphfinder.PatternAtStop;
import org.opentripplanner.common.model.P2;
import java.util.Map;
import org.opentripplanner.routing.core.FareComponent;
import org.opentripplanner.util.model.EncodedPolylineBean;
import org.opentripplanner.model.plan.Itinerary;
import org.opentripplanner.model.plan.Leg;
import org.opentripplanner.model.TripPattern;
import org.opentripplanner.model.plan.StopArrival;
import org.opentripplanner.routing.graphfinder.PlaceAtDistance;
import graphql.relay.Connection;
import graphql.relay.Edge;
import org.opentripplanner.model.Route;
import org.opentripplanner.model.plan.WalkStep;
import org.opentripplanner.routing.graphfinder.NearbyStop;
import graphql.relay.Connection;
import graphql.relay.Edge;
import org.opentripplanner.ext.legacygraphqlapi.model.LegacyGraphQLStopOnRouteModel;
import org.opentripplanner.ext.legacygraphqlapi.model.LegacyGraphQLStopOnTripModel;
import org.opentripplanner.model.TripTimeOnDate;
import org.opentripplanner.model.StopTimesInPattern;
import org.opentripplanner.routing.core.FareRuleSet;
import java.util.Map;
import org.opentripplanner.model.Trip;
import org.opentripplanner.ext.legacygraphqlapi.model.LegacyGraphQLUnknownModel;
import org.opentripplanner.routing.vehicle_parking.VehicleParking;
import org.opentripplanner.routing.vehicle_parking.VehicleParkingSpaces;
import org.opentripplanner.routing.vehicle_parking.VehicleParkingState;
import org.opentripplanner.model.SystemNotice;
import graphql.schema.TypeResolver;
import graphql.schema.DataFetcher;

public class LegacyGraphQLDataFetchers {

    /**
     * A public transport agency
     */
    public interface LegacyGraphQLAgency {

        public DataFetcher<Iterable<TransitAlert>> alerts();

        public DataFetcher<String> fareUrl();

        public DataFetcher<String> gtfsId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<String> lang();

        public DataFetcher<String> name();

        public DataFetcher<String> phone();

        public DataFetcher<Iterable<Route>> routes();

        public DataFetcher<String> timezone();

        public DataFetcher<String> url();
    }

    /**
     * Alert of a current or upcoming disruption in public transportation
     */
    public interface LegacyGraphQLAlert {

        public DataFetcher<Agency> agency();

        public DataFetcher<String> alertCause();

        public DataFetcher<String> alertDescriptionText();

        public DataFetcher<Iterable<Map.Entry<String, String>>> alertDescriptionTextTranslations();

        public DataFetcher<String> alertEffect();

        public DataFetcher<Integer> alertHash();

        public DataFetcher<String> alertHeaderText();

        public DataFetcher<Iterable<Map.Entry<String, String>>> alertHeaderTextTranslations();

        public DataFetcher<String> alertSeverityLevel();

        public DataFetcher<String> alertUrl();

        public DataFetcher<Iterable<Map.Entry<String, String>>> alertUrlTranslations();

        public DataFetcher<Long> effectiveEndDate();

        public DataFetcher<Long> effectiveStartDate();

        public DataFetcher<Iterable<Object>> entities();

        public DataFetcher<String> feed();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Iterable<TripPattern>> patterns();

        public DataFetcher<Route> route();

        public DataFetcher<Object> stop();

        public DataFetcher<Trip> trip();
    }

    /**
     * Entity related to an alert
     */
    public interface LegacyGraphQLAlertEntity extends TypeResolver {
    }

    /**
     * Bike park represents a location where bicycles can be parked.
     */
    public interface LegacyGraphQLBikePark {

        public DataFetcher<String> bikeParkId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<Iterable<Object>> openingHours();

        public DataFetcher<Boolean> realtime();

        public DataFetcher<Integer> spacesAvailable();

        public DataFetcher<Iterable<String>> tags();
    }

    /**
     * Bike rental station represents a location where users can rent bicycles for a fee.
     */
    public interface LegacyGraphQLBikeRentalStation {

        public DataFetcher<Boolean> allowDropoff();

        public DataFetcher<Boolean> allowDropoffNow();

        public DataFetcher<Boolean> allowOverloading();

        public DataFetcher<Boolean> allowPickup();

        public DataFetcher<Boolean> allowPickupNow();

        public DataFetcher<Integer> bikesAvailable();

        public DataFetcher<Integer> capacity();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<Iterable<String>> networks();

        public DataFetcher<Boolean> operative();

        public DataFetcher<Boolean> realtime();

        public DataFetcher<VehicleRentalStationUris> rentalUris();

        public DataFetcher<Integer> spacesAvailable();

        public DataFetcher<String> state();

        public DataFetcher<String> stationId();
    }

    public interface LegacyGraphQLBikeRentalStationUris {

        public DataFetcher<String> android();

        public DataFetcher<String> ios();

        public DataFetcher<String> web();
    }

    public interface LegacyGraphQLBookingInfo {

        public DataFetcher<org.opentripplanner.model.ContactInfo> contactInfo();

        public DataFetcher<String> dropOffMessage();

        public DataFetcher<org.opentripplanner.model.BookingTime> earliestBookingTime();

        public DataFetcher<org.opentripplanner.model.BookingTime> latestBookingTime();

        public DataFetcher<Long> maximumBookingNoticeSeconds();

        public DataFetcher<String> message();

        public DataFetcher<Long> minimumBookingNoticeSeconds();

        public DataFetcher<String> pickupMessage();
    }

    public interface LegacyGraphQLBookingTime {

        public DataFetcher<Integer> daysPrior();

        public DataFetcher<String> time();
    }

    /**
     * Car park represents a location where cars can be parked.
     */
    public interface LegacyGraphQLCarPark {

        public DataFetcher<String> carParkId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<Integer> maxCapacity();

        public DataFetcher<String> name();

        public DataFetcher<Iterable<Object>> openingHours();

        public DataFetcher<Boolean> realtime();

        public DataFetcher<Integer> spacesAvailable();

        public DataFetcher<Iterable<String>> tags();
    }

    /**
     * Cluster is a list of stops grouped by name and proximity
     */
    public interface LegacyGraphQLCluster {

        public DataFetcher<String> gtfsId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<Iterable<Object>> stops();
    }

    public interface LegacyGraphQLContactInfo {

        public DataFetcher<String> additionalDetails();

        public DataFetcher<String> bookingUrl();

        public DataFetcher<String> contactPerson();

        public DataFetcher<String> eMail();

        public DataFetcher<String> faxNumber();

        public DataFetcher<String> infoUrl();

        public DataFetcher<String> phoneNumber();
    }

    public interface LegacyGraphQLCoordinates {

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();
    }

    /**
     * Departure row is a location, which lists departures of a certain pattern from a stop.
     * Departure rows are identified with the pattern, so querying departure rows will return only
     * departures from one stop per pattern
     */
    public interface LegacyGraphQLDepartureRow {

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<TripPattern> pattern();

        public DataFetcher<Object> stop();

        public DataFetcher<Iterable<TripTimeOnDate>> stoptimes();
    }

    /**
     * A feed provides routing data (stops, routes, timetables, etc.) from one or more public
     * transport agencies.
     */
    public interface LegacyGraphQLFeed {

        public DataFetcher<Iterable<Agency>> agencies();

        public DataFetcher<Iterable<TransitAlert>> alerts();

        public DataFetcher<String> feedId();
    }

    public interface LegacyGraphQLGeometry {

        public DataFetcher<Integer> length();

        public DataFetcher<String> points();
    }

    public interface LegacyGraphQLItinerary {

        public DataFetcher<Boolean> arrivedAtDestinationWithRentedBicycle();

        public DataFetcher<Long> duration();

        public DataFetcher<Double> elevationGained();

        public DataFetcher<Double> elevationLost();

        public DataFetcher<Long> endTime();

        public DataFetcher<Iterable<Map<String, Object>>> fares();

        public DataFetcher<Integer> generalizedCost();

        public DataFetcher<Iterable<Leg>> legs();

        public DataFetcher<Long> startTime();

        public DataFetcher<Iterable<SystemNotice>> systemNotices();

        public DataFetcher<Long> waitingTime();

        public DataFetcher<Double> walkDistance();

        public DataFetcher<Long> walkTime();
    }

    public interface LegacyGraphQLLeg {

        public DataFetcher<Agency> agency();

        public DataFetcher<Integer> arrivalDelay();

        public DataFetcher<Integer> departureDelay();

        public DataFetcher<Double> distance();

        public DataFetcher<org.opentripplanner.model.BookingInfo> dropOffBookingInfo();

        public DataFetcher<String> dropoffType();

        public DataFetcher<Double> duration();

        public DataFetcher<Long> endTime();

        public DataFetcher<StopArrival> from();

        public DataFetcher<Integer> generalizedCost();

        public DataFetcher<Boolean> interlineWithPreviousLeg();

        public DataFetcher<Boolean> intermediatePlace();

        public DataFetcher<Iterable<StopArrival>> intermediatePlaces();

        public DataFetcher<Iterable<Object>> intermediateStops();

        public DataFetcher<EncodedPolylineBean> legGeometry();

        public DataFetcher<String> mode();

        public DataFetcher<org.opentripplanner.model.BookingInfo> pickupBookingInfo();

        public DataFetcher<String> pickupType();

        public DataFetcher<Boolean> realTime();

        public DataFetcher<String> realtimeState();

        public DataFetcher<Boolean> rentedBike();

        public DataFetcher<Route> route();

        public DataFetcher<String> serviceDate();

        public DataFetcher<Long> startTime();

        public DataFetcher<Iterable<WalkStep>> steps();

        public DataFetcher<StopArrival> to();

        public DataFetcher<Boolean> transitLeg();

        public DataFetcher<Trip> trip();

        public DataFetcher<Boolean> walkingBike();
    }

    /**
     * A span of time.
     */
    public interface LegacyGraphQLLocalTimeSpan {

        public DataFetcher<Integer> from();

        public DataFetcher<Integer> to();
    }

    /**
     * A date using the local timezone of the object that can contain timespans.
     */
    public interface LegacyGraphQLLocalTimeSpanDate {

        public DataFetcher<String> date();

        public DataFetcher<Iterable<Object>> timeSpans();
    }

    /**
     * An object with an ID
     */
    public interface LegacyGraphQLNode extends TypeResolver {

        default public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id() {return null;}
    }

    /**
     * Information about pagination in a connection.
     */
    public interface LegacyGraphQLPageInfo {

        public DataFetcher<String> endCursor();

        public DataFetcher<Boolean> hasNextPage();

        public DataFetcher<Boolean> hasPreviousPage();

        public DataFetcher<String> startCursor();
    }

    /**
     * Pattern is sequence of stops used by trips on a specific direction and variant of a route.
     * Most routes have only two patterns: one for outbound trips and one for inbound trips
     */
    public interface LegacyGraphQLPattern {

        public DataFetcher<Iterable<TransitAlert>> alerts();

        public DataFetcher<String> code();

        public DataFetcher<Integer> directionId();

        public DataFetcher<Iterable<Coordinate>> geometry();

        public DataFetcher<String> headsign();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<String> name();

        public DataFetcher<EncodedPolylineBean> patternGeometry();

        public DataFetcher<Route> route();

        public DataFetcher<String> semanticHash();

        public DataFetcher<Iterable<Object>> stops();

        public DataFetcher<Iterable<Trip>> trips();

        public DataFetcher<Iterable<Trip>> tripsForDate();
    }

    public interface LegacyGraphQLPlace {

        public DataFetcher<Long> arrivalTime();

        public DataFetcher<VehicleParking> bikePark();

        public DataFetcher<VehicleRentalPlace> bikeRentalStation();

        public DataFetcher<VehicleParking> carPark();

        public DataFetcher<Long> departureTime();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<VehicleRentalVehicle> rentalVehicle();

        public DataFetcher<Object> stop();

        public DataFetcher<VehicleParking> vehicleParking();

        public DataFetcher<VehicleRentalStation> vehicleRentalStation();

        public DataFetcher<String> vertexType();
    }

    /**
     * Interface for places, e.g. stops, stations, parking areas..
     */
    public interface LegacyGraphQLPlaceInterface extends TypeResolver {

        default public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id() {return null;}

        default public DataFetcher<Double> lat() {return null;}

        default public DataFetcher<Double> lon() {return null;}
    }

    public interface LegacyGraphQLPlan {

        public DataFetcher<Long> date();

        public DataFetcher<DebugOutput> debugOutput();

        public DataFetcher<StopArrival> from();

        public DataFetcher<Iterable<Itinerary>> itineraries();

        public DataFetcher<Iterable<String>> messageEnums();

        public DataFetcher<Iterable<String>> messageStrings();

        public DataFetcher<Long> nextDateTime();

        public DataFetcher<String> nextPageCursor();

        public DataFetcher<Long> prevDateTime();

        public DataFetcher<String> previousPageCursor();

        public DataFetcher<Long> searchWindowUsed();

        public DataFetcher<StopArrival> to();
    }

    public interface LegacyGraphQLQueryType {

        public DataFetcher<Iterable<Agency>> agencies();

        public DataFetcher<Agency> agency();

        public DataFetcher<Iterable<TransitAlert>> alerts();

        public DataFetcher<VehicleParking> bikePark();

        public DataFetcher<Iterable<VehicleParking>> bikeParks();

        public DataFetcher<VehicleRentalPlace> bikeRentalStation();

        public DataFetcher<Iterable<VehicleRentalPlace>> bikeRentalStations();

        public DataFetcher<Iterable<TripTimeOnDate>> cancelledTripTimes();

        public DataFetcher<VehicleParking> carPark();

        public DataFetcher<Iterable<VehicleParking>> carParks();

        public DataFetcher<Object> cluster();

        public DataFetcher<Iterable<Object>> clusters();

        public DataFetcher<PatternAtStop> departureRow();

        public DataFetcher<Iterable<String>> feeds();

        public DataFetcher<Trip> fuzzyTrip();

        public DataFetcher<Connection<PlaceAtDistance>> nearest();

        public DataFetcher<Object> node();

        public DataFetcher<TripPattern> pattern();

        public DataFetcher<Iterable<TripPattern>> patterns();

        public DataFetcher<graphql.execution.DataFetcherResult<org.opentripplanner.routing.api.response.RoutingResponse>> plan();

        public DataFetcher<VehicleRentalVehicle> rentalVehicle();

        public DataFetcher<Iterable<VehicleRentalVehicle>> rentalVehicles();

        public DataFetcher<Route> route();

        public DataFetcher<Iterable<Route>> routes();

        public DataFetcher<Object> serviceTimeRange();

        public DataFetcher<Object> station();

        public DataFetcher<Iterable<Object>> stations();

        public DataFetcher<Object> stop();

        public DataFetcher<Iterable<Object>> stops();

        public DataFetcher<Iterable<Object>> stopsByBbox();

        public DataFetcher<Connection<NearbyStop>> stopsByRadius();

        public DataFetcher<Iterable<FareRuleSet>> ticketTypes();

        public DataFetcher<Trip> trip();

        public DataFetcher<Iterable<Trip>> trips();

        public DataFetcher<VehicleParking> vehicleParking();

        public DataFetcher<Iterable<VehicleParking>> vehicleParkings();

        public DataFetcher<VehicleRentalStation> vehicleRentalStation();

        public DataFetcher<Iterable<VehicleRentalStation>> vehicleRentalStations();

        public DataFetcher<Object> viewer();
    }

    /**
     * Rental vehicle represents a vehicle that belongs to a rental network.
     */
    public interface LegacyGraphQLRentalVehicle {

        public DataFetcher<Boolean> allowPickupNow();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<String> network();

        public DataFetcher<Boolean> operative();

        public DataFetcher<VehicleRentalStationUris> rentalUris();

        public DataFetcher<String> vehicleId();
    }

    /**
     * Route represents a public transportation service, usually from point A to point B and *back*,
     * shown to customers under a single name, e.g. bus 550. Routes contain patterns (see field
     * `patterns`), which describe different variants of the route, e.g. outbound pattern from point
     * A to point B and inbound pattern from point B to point A.
     */
    public interface LegacyGraphQLRoute {

        public DataFetcher<Agency> agency();

        public DataFetcher<Iterable<TransitAlert>> alerts();

        public DataFetcher<String> bikesAllowed();

        public DataFetcher<String> color();

        public DataFetcher<String> desc();

        public DataFetcher<String> gtfsId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<String> longName();

        public DataFetcher<String> mode();

        public DataFetcher<Iterable<TripPattern>> patterns();

        public DataFetcher<String> shortName();

        public DataFetcher<Iterable<Object>> stops();

        public DataFetcher<String> textColor();

        public DataFetcher<Iterable<Trip>> trips();

        public DataFetcher<Integer> type();

        public DataFetcher<String> url();
    }

    /**
     * Route type entity which covers all agencies if agency is null, otherwise only relevant for
     * one agency.
     */
    public interface LegacyGraphQLRouteType {

        public DataFetcher<Agency> agency();

        public DataFetcher<Integer> routeType();

        public DataFetcher<Iterable<Route>> routes();
    }

    /**
     * Stop can represent either a single public transport stop, where passengers can board and/or
     * disembark vehicles, or a station, which contains multiple stops. See field `locationType`.
     */
    public interface LegacyGraphQLStop {

        public DataFetcher<Iterable<TransitAlert>> alerts();

        public DataFetcher<Object> cluster();

        public DataFetcher<String> code();

        public DataFetcher<String> desc();

        public DataFetcher<String> direction();

        public DataFetcher<Object> geometries();

        public DataFetcher<String> gtfsId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Object> locationType();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<Object> parentStation();

        public DataFetcher<Iterable<TripPattern>> patterns();

        public DataFetcher<String> platformCode();

        public DataFetcher<Iterable<Route>> routes();

        public DataFetcher<Iterable<TripTimeOnDate>> stopTimesForPattern();

        public DataFetcher<Iterable<Object>> stops();

        public DataFetcher<Iterable<StopTimesInPattern>> stoptimesForPatterns();

        public DataFetcher<Iterable<StopTimesInPattern>> stoptimesForServiceDate();

        public DataFetcher<Iterable<TripTimeOnDate>> stoptimesWithoutPatterns();

        public DataFetcher<String> timezone();

        public DataFetcher<Iterable<NearbyStop>> transfers();

        public DataFetcher<String> url();

        public DataFetcher<String> vehicleMode();

        public DataFetcher<Integer> vehicleType();

        public DataFetcher<Object> wheelchairBoarding();

        public DataFetcher<String> zoneId();
    }

    public interface LegacyGraphQLStopGeometries {

        public DataFetcher<org.locationtech.jts.geom.Geometry> geoJson();

        public DataFetcher<Iterable<EncodedPolylineBean>> googleEncoded();
    }

    /**
     * Stop that should (but not guaranteed) to exist on a route.
     */
    public interface LegacyGraphQLStopOnRoute {

        public DataFetcher<Route> route();

        public DataFetcher<Object> stop();
    }

    /**
     * Stop that should (but not guaranteed) to exist on a trip.
     */
    public interface LegacyGraphQLStopOnTrip {

        public DataFetcher<Object> stop();

        public DataFetcher<Trip> trip();
    }

    /**
     * Stoptime represents the time when a specific trip arrives to or departs from a specific
     * stop.
     */
    public interface LegacyGraphQLStoptime {

        public DataFetcher<Integer> arrivalDelay();

        public DataFetcher<Integer> departureDelay();

        public DataFetcher<String> dropoffType();

        public DataFetcher<String> headsign();

        public DataFetcher<String> pickupType();

        public DataFetcher<Boolean> realtime();

        public DataFetcher<Integer> realtimeArrival();

        public DataFetcher<Integer> realtimeDeparture();

        public DataFetcher<String> realtimeState();

        public DataFetcher<Integer> scheduledArrival();

        public DataFetcher<Integer> scheduledDeparture();

        public DataFetcher<Long> serviceDay();

        public DataFetcher<Object> stop();

        public DataFetcher<Boolean> timepoint();

        public DataFetcher<Trip> trip();
    }

    /**
     * Stoptimes grouped by pattern
     */
    public interface LegacyGraphQLStoptimesInPattern {

        public DataFetcher<TripPattern> pattern();

        public DataFetcher<Iterable<TripTimeOnDate>> stoptimes();
    }

    /**
     * A system notice is used to tag elements with system information for debugging or other system
     * related purpose. One use-case is to run a routing search with 'debugItineraryFilter: true'.
     * This will then tag itineraries instead of removing them from the result. This make it
     * possible to inspect the itinerary-filter-chain. A SystemNotice only has english text, because
     * the primary user are technical staff, like testers and developers.
     */
    public interface LegacyGraphQLSystemNotice {

        public DataFetcher<String> tag();

        public DataFetcher<String> text();
    }

    /**
     * Describes ticket type
     */
    public interface LegacyGraphQLTicketType {

        public DataFetcher<String> currency();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> fareId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> price();

        public DataFetcher<Iterable<String>> zones();
    }

    /**
     * Text with language
     */
    public interface LegacyGraphQLTranslatedString {

        public DataFetcher<String> language();

        public DataFetcher<String> text();
    }

    /**
     * Trip is a specific occurance of a pattern, usually identified by route, direction on the
     * route and exact departure time.
     */
    public interface LegacyGraphQLTrip {

        public DataFetcher<Iterable<String>> activeDates();

        public DataFetcher<Iterable<TransitAlert>> alerts();

        public DataFetcher<TripTimeOnDate> arrivalStoptime();

        public DataFetcher<String> bikesAllowed();

        public DataFetcher<String> blockId();

        public DataFetcher<TripTimeOnDate> departureStoptime();

        public DataFetcher<String> directionId();

        public DataFetcher<Iterable<Iterable<Double>>> geometry();

        public DataFetcher<String> gtfsId();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<TripPattern> pattern();

        public DataFetcher<Route> route();

        public DataFetcher<String> routeShortName();

        public DataFetcher<String> semanticHash();

        public DataFetcher<String> serviceId();

        public DataFetcher<String> shapeId();

        public DataFetcher<Iterable<Object>> stops();

        public DataFetcher<Iterable<TripTimeOnDate>> stoptimes();

        public DataFetcher<Iterable<TripTimeOnDate>> stoptimesForDate();

        public DataFetcher<EncodedPolylineBean> tripGeometry();

        public DataFetcher<String> tripHeadsign();

        public DataFetcher<String> tripShortName();

        public DataFetcher<Object> wheelchairAccessible();
    }

    /**
     * This is used for alert entities that we don't explicitly handle or they are missing.
     */
    public interface LegacyGraphQLUnknown {

        public DataFetcher<String> description();
    }

    /**
     * Vehicle parking represents a location where bicycles or cars can be parked.
     */
    public interface LegacyGraphQLVehicleParking {

        public DataFetcher<Boolean> anyCarPlaces();

        public DataFetcher<VehicleParkingSpaces> availability();

        public DataFetcher<Boolean> bicyclePlaces();

        public DataFetcher<VehicleParkingSpaces> capacity();

        public DataFetcher<Boolean> carPlaces();

        public DataFetcher<String> detailsUrl();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<String> imageUrl();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<String> note();

        public DataFetcher<Boolean> realtime();

        public DataFetcher<VehicleParkingState> state();

        public DataFetcher<Iterable<String>> tags();

        public DataFetcher<String> vehicleParkingId();

        public DataFetcher<Boolean> wheelchairAccessibleCarPlaces();
    }

    /**
     * The number of spaces by type. null if unknown.
     */
    public interface LegacyGraphQLVehicleParkingSpaces {

        public DataFetcher<Integer> bicycleSpaces();

        public DataFetcher<Integer> carSpaces();

        public DataFetcher<Integer> wheelchairAccessibleCarSpaces();
    }

    /**
     * Vehicle rental station represents a location where users can rent bicycles etc. for a fee.
     */
    public interface LegacyGraphQLVehicleRentalStation {

        public DataFetcher<Boolean> allowDropoff();

        public DataFetcher<Boolean> allowDropoffNow();

        public DataFetcher<Boolean> allowOverloading();

        public DataFetcher<Boolean> allowPickup();

        public DataFetcher<Boolean> allowPickupNow();

        public DataFetcher<Integer> capacity();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();

        public DataFetcher<String> name();

        public DataFetcher<String> network();

        public DataFetcher<Boolean> operative();

        public DataFetcher<Boolean> realtime();

        public DataFetcher<VehicleRentalStationUris> rentalUris();

        public DataFetcher<Integer> spacesAvailable();

        public DataFetcher<String> stationId();

        public DataFetcher<Integer> vehiclesAvailable();
    }

    public interface LegacyGraphQLVehicleRentalUris {

        public DataFetcher<String> android();

        public DataFetcher<String> ios();

        public DataFetcher<String> web();
    }

    public interface LegacyGraphQLDebugOutput {

        public DataFetcher<Long> pathCalculationTime();

        public DataFetcher<Long> precalculationTime();

        public DataFetcher<Long> renderingTime();

        public DataFetcher<Boolean> timedOut();

        public DataFetcher<Long> totalTime();
    }

    public interface LegacyGraphQLElevationProfileComponent {

        public DataFetcher<Double> distance();

        public DataFetcher<Double> elevation();
    }

    public interface LegacyGraphQLFare {

        public DataFetcher<Integer> cents();

        public DataFetcher<Iterable<FareComponent>> components();

        public DataFetcher<String> currency();

        public DataFetcher<String> type();
    }

    /**
     * Component of the fare (i.e. ticket) for a part of the itinerary
     */
    public interface LegacyGraphQLFareComponent {

        public DataFetcher<Integer> cents();

        public DataFetcher<String> currency();

        public DataFetcher<String> fareId();

        public DataFetcher<Iterable<Route>> routes();
    }

    public interface LegacyGraphQLPlaceAtDistance {

        public DataFetcher<Integer> distance();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Object> place();
    }

    /**
     * A connection to a list of items.
     */
    public interface LegacyGraphQLPlaceAtDistanceConnection {

        public DataFetcher<Iterable<Edge<PlaceAtDistance>>> edges();

        public DataFetcher<Object> pageInfo();
    }

    /**
     * An edge in a connection.
     */
    public interface LegacyGraphQLPlaceAtDistanceEdge {

        public DataFetcher<String> cursor();

        public DataFetcher<PlaceAtDistance> node();
    }

    /**
     * Time range for which the API has data available
     */
    public interface LegacyGraphQLServiceTimeRange {

        public DataFetcher<Long> end();

        public DataFetcher<Long> start();
    }

    public interface LegacyGraphQLStep {

        public DataFetcher<Double> distance();

        public DataFetcher<Iterable<P2<Double>>> elevationProfile();

        public DataFetcher<Double> lat();

        public DataFetcher<Double> lon();
    }

    public interface LegacyGraphQLStopAtDistance {

        public DataFetcher<Integer> distance();

        public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

        public DataFetcher<Object> stop();
    }

    /**
     * A connection to a list of items.
     */
    public interface LegacyGraphQLStopAtDistanceConnection {

        public DataFetcher<Iterable<Edge<NearbyStop>>> edges();

        public DataFetcher<Object> pageInfo();
    }

    /**
     * An edge in a connection.
     */
    public interface LegacyGraphQLStopAtDistanceEdge {

        public DataFetcher<String> cursor();

        public DataFetcher<NearbyStop> node();
    }

}
