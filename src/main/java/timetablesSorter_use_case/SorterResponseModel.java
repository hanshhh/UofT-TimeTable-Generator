package timetablesSorter_use_case;

import display_timetable_use_case.interface_adapters.TimetableViewModel;

/**
 * A response model that contains the relevant information needed by the presenter's view
 */
public class SorterResponseModel {
    private final TimetableViewModel[] timetables;

    /**
     * @param timetables the array of timetables
     */
    public SorterResponseModel(TimetableViewModel[] timetables) {
        this.timetables = timetables;
    }

    /**
     * @return returns an array of TimetableViewModels
     */
    public TimetableViewModel[] getTimetables() {
        return timetables;
    }
}
