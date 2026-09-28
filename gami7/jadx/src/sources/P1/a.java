package P1;

import W1.U;
import java.util.Map;
import m2.C0880v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5230h;

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f5230h) {
            case 0:
                z2.h.f((Map) obj, "permissions");
                return C0880v.f8657a;
            case 1:
                R1.b bVar = (R1.b) obj;
                z2.h.f(bVar, "it");
                return bVar.f5475a;
            case 2:
                U u3 = (U) obj;
                z2.h.f(u3, "it");
                return u3.f6003b;
            case 3:
                R1.g gVar = (R1.g) obj;
                z2.h.f(gVar, "it");
                return gVar.f5506a.f5496a;
            case 4:
                z2.h.f((String) obj, "it");
                return C0880v.f8657a;
            case AbstractC1166e.f10138f /* 5 */:
                R1.g gVar2 = (R1.g) obj;
                z2.h.f(gVar2, "it");
                return gVar2.f5506a.f5496a;
            case AbstractC1166e.f10136d /* 6 */:
                z2.h.f((String) obj, "it");
                return C0880v.f8657a;
            case 7:
                z2.h.f((String) obj, "it");
                return C0880v.f8657a;
            default:
                R1.e eVar = (R1.e) obj;
                z2.h.f(eVar, "it");
                return eVar.f5490a;
        }
    }
}
