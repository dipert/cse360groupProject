package groupProject;
public class ListItem
{
	private String description;
	private int priority;
	private int dueMonth;
	private int dueDay;
	private int dueYear;
	private int startMonth;
	private int startDay;
	private int startYear;
	private int finishMonth;
	private int finishDay;
	private int finishYear;
	private String status;

	ListItem() {
		description = "";
		priority = 0;
		dueMonth = 0;
		dueDay = 0;
		dueYear = 0;
		startMonth = 0;
		startDay = 0;
		startYear = 0;
		finishMonth = 0;
		finishDay = 0;
		finishYear = 0;
		status = "";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getDueMonth() {
		return dueMonth;
	}

	public void setDueMonth(int dueMonth) {
		this.dueMonth = dueMonth;
	}

	public int getDueDay() {
		return dueDay;
	}

	public void setDueDay(int dueDay) {
		this.dueDay = dueDay;
	}

	public int getDueYear() {
		return dueYear;
	}

	public void setDueYear(int dueYear) {
		this.dueYear = dueYear;
	}

	public int getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}

	public int getStartDay() {
		return startDay;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getFinishMonth() {
		return finishMonth;
	}

	public void setFinishMonth(int finishMonth) {
		this.finishMonth = finishMonth;
	}

	public int getFinishDay() {
		return finishDay;
	}

	public void setFinishDay(int finishDay) {
		this.finishDay = finishDay;
	}

	public int getFinishYear() {
		return finishYear;
	}

	public void setFinishYear(int finishYear) {
		this.finishYear = finishYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String  status) {
		this.status = status;
	}
	
}
	
	
	

