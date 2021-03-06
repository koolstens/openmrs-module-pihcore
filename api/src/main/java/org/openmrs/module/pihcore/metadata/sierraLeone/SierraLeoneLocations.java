package org.openmrs.module.pihcore.metadata.sierraLeone;

import org.openmrs.module.metadatadeploy.descriptor.LocationDescriptor;
import org.openmrs.module.metadatadeploy.descriptor.LocationTagDescriptor;
import org.openmrs.module.pihcore.metadata.core.LocationTags;

import java.util.Arrays;
import java.util.List;

public class SierraLeoneLocations {

    public static LocationDescriptor WELLBODY_HEALTH_CENTER = new LocationDescriptor() {
        public String uuid() { return "b6733150-7426-11e5-a837-0800200c9a66"; }
        public String name() { return "Wellbody Health Center"; }
        public String description() { return "Wellbody Health Center"; }
        public List<LocationTagDescriptor> tags() { return Arrays.asList(LocationTags.MEDICAL_RECORD_LOCATION, LocationTags.ARCHIVES_LOCATION, LocationTags.VISIT_LOCATION); }
    };
}
