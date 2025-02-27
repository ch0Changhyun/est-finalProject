package com.example.whatseoul.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CULTURE_EVENT")
@Builder
public class CultureEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_ID")
    private Long eventId;

    @Column(name = "EVENT_NM")
    private String culturalEventName;

    @Column(name = "EVENT_PERIOD")
    private String culturalEventPeriod;

    @Column(name = "EVENT_PLACE")
    private String culturalEventPlace;

    @Column(name = "URL")
    private String culturalEventUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AREA_CODE", referencedColumnName = "AREA_CODE")
    private Area area;

}