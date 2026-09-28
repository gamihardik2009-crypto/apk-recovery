package K1;

import r1.x;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(r1.r rVar, int i2) {
        super(rVar);
        this.f4545d = i2;
    }

    @Override // r1.x
    public final String b() {
        switch (this.f4545d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 2:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 3:
                return "DELETE FROM WorkProgress";
            case 4:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case AbstractC1166e.f10138f /* 5 */:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case AbstractC1166e.f10136d /* 6 */:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case 7:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 8:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case AbstractC1166e.f10135c /* 9 */:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case AbstractC1166e.f10137e /* 10 */:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 11:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 12:
                return "DELETE FROM workspec WHERE id=?";
            case 13:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 14:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case AbstractC1166e.f10139g /* 15 */:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 16:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 17:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case 18:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 19:
                return "DELETE FROM worktag WHERE work_spec_id=?";
            case 20:
                return "DELETE FROM clients WHERE source = ?";
            case 21:
                return "DELETE FROM schedules";
            default:
                return "DELETE FROM schedules WHERE status = 'PENDING'";
        }
    }
}
