package Q1;

import w1.C1387i;

/* loaded from: classes.dex */
public final class j extends r1.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f5291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, r1.r rVar) {
        super(rVar, 0);
        this.f5291d = kVar;
    }

    @Override // r1.x
    public final String b() {
        return "UPDATE OR ABORT `schedules` SET `id` = ?,`clientId` = ?,`templateId` = ?,`scheduledDate` = ?,`scheduledTime` = ?,`status` = ?,`retryCount` = ?,`campaignId` = ?,`week` = ?,`message` = ? WHERE `id` = ?";
    }

    @Override // r1.i
    public final void d(C1387i c1387i, Object obj) {
        R1.f fVar = (R1.f) obj;
        c1387i.p(fVar.f5496a, 1);
        c1387i.p(fVar.f5497b, 2);
        c1387i.p(fVar.f5498c, 3);
        c1387i.p(fVar.f5499d, 4);
        c1387i.p(fVar.f5500e, 5);
        ((C1.b) this.f5291d.f5294c).getClass();
        R1.c cVar = fVar.f5501f;
        z2.h.f(cVar, "value");
        c1387i.p(cVar.name(), 6);
        c1387i.t(fVar.f5502g, 7);
        String str = fVar.f5503h;
        if (str == null) {
            c1387i.n(8);
        } else {
            c1387i.p(str, 8);
        }
        c1387i.p(fVar.f5504i, 9);
        c1387i.p(fVar.f5505j, 10);
        c1387i.p(fVar.f5496a, 11);
    }
}
