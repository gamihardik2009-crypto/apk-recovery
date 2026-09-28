package H;

import J.C0274k0;
import m.C0839l;
import m2.C0880v;
import p.InterfaceC1012d0;

/* renamed from: H.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139k4 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2805i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0193s4 f2806j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f2807k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z2.p f2808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1012d0 f2809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139k4(float f3, C0193s4 c0193s4, z2.p pVar, InterfaceC1012d0 interfaceC1012d0) {
        super(1);
        this.f2807k = f3;
        this.f2806j = c0193s4;
        this.f2808l = pVar;
        this.f2809m = interfaceC1012d0;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f2805i) {
            case 0:
                C0839l c0839l = (C0839l) obj;
                float abs = Math.abs(((Number) c0839l.f8512e.getValue()).floatValue());
                float f3 = this.f2807k;
                float abs2 = Math.abs(f3);
                C0274k0 c0274k0 = c0839l.f8512e;
                InterfaceC1012d0 interfaceC1012d0 = this.f2809m;
                z2.p pVar = this.f2808l;
                if (abs >= abs2) {
                    float floatValue = ((Number) c0274k0.getValue()).floatValue();
                    this.f2806j.getClass();
                    float e3 = C0193s4.e(floatValue, f3) - pVar.f11906h;
                    if (Math.abs(e3 - interfaceC1012d0.a(e3)) > 0.5f) {
                        c0839l.a();
                    }
                    c0839l.a();
                } else {
                    float floatValue2 = ((Number) c0274k0.getValue()).floatValue() - pVar.f11906h;
                    if (Math.abs(floatValue2 - interfaceC1012d0.a(floatValue2)) > 0.5f) {
                        c0839l.a();
                    }
                    pVar.f11906h = ((Number) c0274k0.getValue()).floatValue();
                }
                break;
            default:
                C0839l c0839l2 = (C0839l) obj;
                float floatValue3 = ((Number) c0839l2.f8512e.getValue()).floatValue();
                this.f2806j.getClass();
                float e4 = C0193s4.e(floatValue3, this.f2807k);
                z2.p pVar2 = this.f2808l;
                float f4 = e4 - pVar2.f11906h;
                float a3 = this.f2809m.a(f4);
                if (Math.abs(f4 - a3) > 0.5f || e4 != ((Number) c0839l2.f8512e.getValue()).floatValue()) {
                    c0839l2.a();
                }
                pVar2.f11906h += a3;
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139k4(C0193s4 c0193s4, float f3, z2.p pVar, InterfaceC1012d0 interfaceC1012d0) {
        super(1);
        this.f2806j = c0193s4;
        this.f2807k = f3;
        this.f2808l = pVar;
        this.f2809m = interfaceC1012d0;
    }
}
