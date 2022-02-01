package com.example.springboot_learning.events;

import java.util.List;

import com.example.springboot_learning.github.RepositoryEvent;

public class DashboardEntry {

	private final GithubProject project;

	private final List<RepositoryEvent> events;

	public DashboardEntry(GithubProject project, List<RepositoryEvent> events) {
		this.project = project;
		this.events = events;
	}

	public GithubProject getProject() {
		return project;
	}

	public List<RepositoryEvent> getEvents() {
		return events;
	}
}
