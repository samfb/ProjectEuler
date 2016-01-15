package projecteuler;

import java.util.Arrays;
import java.util.List;
import problem.Problem;

public class ProjectEuler
{
	private static final List<Problem> SOLVED_PROBLEMS = Arrays.asList();
	private static final Problem currentProblem = null;

	public static void main(final String[] args)
	{
//		System.out.println("Answer: " + currentProblem.solve());

		// for testing changes to shared classes
//		System.out.println("All solved problems still valid? " + areSolutionsStillValid());
	}

	public static boolean areSolutionsStillValid()
	{
		return SOLVED_PROBLEMS.stream().allMatch(problem -> isSolutionStillValid(problem));
	}

	public static boolean isSolutionStillValid(final Problem problem)
	{
		return problem.solve() == problem.getKnownAnswer();
	}
}
