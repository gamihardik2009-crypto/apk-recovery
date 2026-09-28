package Q1;

import android.database.Cursor;
import java.util.concurrent.Callable;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import r1.v;

/* loaded from: classes.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f5300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f5301c;

    public /* synthetic */ l(m mVar, v vVar, int i2) {
        this.f5299a = i2;
        this.f5301c = mVar;
        this.f5300b = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        R1.a aVar;
        R1.a aVar2;
        switch (this.f5299a) {
            case 0:
                Cursor p3 = AbstractC0946A.p((r1.r) this.f5301c.f5302a, this.f5300b, false);
                try {
                    int j3 = AbstractC0962n.j(p3, "id");
                    int j4 = AbstractC0962n.j(p3, "workStartTime");
                    int j5 = AbstractC0962n.j(p3, "workEndTime");
                    int j6 = AbstractC0962n.j(p3, "skipSunday");
                    int j7 = AbstractC0962n.j(p3, "timeGapMinutes");
                    int j8 = AbstractC0962n.j(p3, "messageRotationCount");
                    int j9 = AbstractC0962n.j(p3, "automationEnabled");
                    int j10 = AbstractC0962n.j(p3, "newDataAdded");
                    int j11 = AbstractC0962n.j(p3, "automationStartDate");
                    if (p3.moveToFirst()) {
                        aVar = new R1.a(p3.getInt(j3), p3.getString(j4), p3.getString(j5), p3.getInt(j6) != 0, p3.getInt(j7), p3.getInt(j8), p3.getInt(j9) != 0, p3.getInt(j10) != 0, p3.getString(j11));
                    } else {
                        aVar = null;
                    }
                    return aVar;
                } finally {
                    p3.close();
                }
            default:
                r1.r rVar = (r1.r) this.f5301c.f5302a;
                v vVar = this.f5300b;
                Cursor p4 = AbstractC0946A.p(rVar, vVar, false);
                try {
                    int j12 = AbstractC0962n.j(p4, "id");
                    int j13 = AbstractC0962n.j(p4, "workStartTime");
                    int j14 = AbstractC0962n.j(p4, "workEndTime");
                    int j15 = AbstractC0962n.j(p4, "skipSunday");
                    int j16 = AbstractC0962n.j(p4, "timeGapMinutes");
                    int j17 = AbstractC0962n.j(p4, "messageRotationCount");
                    int j18 = AbstractC0962n.j(p4, "automationEnabled");
                    int j19 = AbstractC0962n.j(p4, "newDataAdded");
                    int j20 = AbstractC0962n.j(p4, "automationStartDate");
                    if (p4.moveToFirst()) {
                        aVar2 = new R1.a(p4.getInt(j12), p4.getString(j13), p4.getString(j14), p4.getInt(j15) != 0, p4.getInt(j16), p4.getInt(j17), p4.getInt(j18) != 0, p4.getInt(j19) != 0, p4.getString(j20));
                    } else {
                        aVar2 = null;
                    }
                    return aVar2;
                } finally {
                    p4.close();
                    vVar.c();
                }
        }
    }

    public void finalize() {
        switch (this.f5299a) {
            case 0:
                this.f5300b.c();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
