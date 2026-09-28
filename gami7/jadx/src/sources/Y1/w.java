package Y1;

import M2.InterfaceC0344h;
import M2.f0;
import java.time.LocalDate;
import m2.C0880v;
import n2.AbstractC0949a;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class w extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6366l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6367m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H f6368n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(H h2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6368n = h2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((w) m((InterfaceC0344h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        w wVar = new w(this.f6368n, interfaceC1073d);
        wVar.f6367m = obj;
        return wVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6366l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0344h interfaceC0344h = (InterfaceC0344h) this.f6367m;
            LocalDate minusDays = LocalDate.now().minusDays(r1.getDayOfWeek().getValue() % 7);
            LocalDate plusDays = minusDays.plusDays(6L);
            Q1.p pVar = this.f6368n.f6264b;
            String localDate = minusDays.toString();
            z2.h.e(localDate, "toString(...)");
            String localDate2 = plusDays.toString();
            z2.h.e(localDate2, "toString(...)");
            pVar.getClass();
            Q1.k r3 = pVar.f5312a.r();
            r3.getClass();
            r1.v a3 = r1.v.a("\n        SELECT \n            COUNT(CASE WHEN status = 'SENT' AND scheduledDate BETWEEN ? AND ? THEN 1 END) as sent,\n            COUNT(CASE WHEN status = 'FAILED' AND scheduledDate BETWEEN ? AND ? THEN 1 END) as failed,\n            COUNT(CASE WHEN status = 'PENDING' AND scheduledDate BETWEEN ? AND ? THEN 1 END) as pending\n        FROM schedules\n    ", 6);
            a3.p(localDate, 1);
            a3.p(localDate2, 2);
            a3.p(localDate, 3);
            a3.p(localDate2, 4);
            a3.p(localDate, 5);
            a3.p(localDate2, 6);
            G1.h i3 = AbstractC0949a.i((r1.r) r3.f5292a, false, new String[]{"schedules"}, new Q1.h(r3, a3, 11));
            this.f6366l = 1;
            if (interfaceC0344h instanceof f0) {
                throw ((f0) interfaceC0344h).f4883h;
            }
            Object b3 = i3.b(new v(interfaceC0344h, 0), this);
            if (b3 != enumC1145a) {
                b3 = c0880v;
            }
            if (b3 != enumC1145a) {
                b3 = c0880v;
            }
            if (b3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
