package p;

/* renamed from: p.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1037q implements InterfaceC1012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f9665a;

    public C1037q(r rVar) {
        this.f9665a = rVar;
    }

    @Override // p.InterfaceC1012d0
    public final float a(float f3) {
        if (Float.isNaN(f3)) {
            return 0.0f;
        }
        r rVar = this.f9665a;
        float floatValue = ((Number) rVar.f9668a.l(Float.valueOf(f3))).floatValue();
        rVar.f9672e.setValue(Boolean.valueOf(floatValue > 0.0f));
        rVar.f9673f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
