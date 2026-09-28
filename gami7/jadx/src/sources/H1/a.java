package H1;

import K1.o;
import android.os.Build;
import z2.h;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I1.f fVar, int i2) {
        super(fVar);
        this.f3417b = i2;
        switch (i2) {
            case 2:
                h.f(fVar, "tracker");
                super(fVar);
                this.f3418c = 7;
                break;
            case 3:
                h.f(fVar, "tracker");
                super(fVar);
                this.f3418c = 7;
                break;
            case 4:
                h.f(fVar, "tracker");
                super(fVar);
                this.f3418c = 9;
                break;
            default:
                h.f(fVar, "tracker");
                this.f3418c = 6;
                break;
        }
    }

    @Override // H1.d
    public final int a() {
        switch (this.f3417b) {
        }
        return this.f3418c;
    }

    @Override // H1.d
    public final boolean b(o oVar) {
        switch (this.f3417b) {
            case 0:
                return oVar.f4573j.f276b;
            case 1:
                return oVar.f4573j.f278d;
            case 2:
                return oVar.f4573j.f275a == 2;
            case 3:
                int i2 = oVar.f4573j.f275a;
                return i2 == 3 || (Build.VERSION.SDK_INT >= 30 && i2 == 6);
            default:
                return oVar.f4573j.f279e;
        }
    }

    @Override // H1.d
    public final boolean c(Object obj) {
        switch (this.f3417b) {
            case 2:
                G1.d dVar = (G1.d) obj;
                h.f(dVar, "value");
                if (!dVar.f1231a || !dVar.f1232b) {
                }
                break;
            case 3:
                G1.d dVar2 = (G1.d) obj;
                h.f(dVar2, "value");
                if (!dVar2.f1231a || dVar2.f1233c) {
                }
                break;
        }
        return !((Boolean) obj).booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I1.a aVar) {
        super(aVar);
        this.f3417b = 1;
        h.f(aVar, "tracker");
        this.f3418c = 5;
    }
}
