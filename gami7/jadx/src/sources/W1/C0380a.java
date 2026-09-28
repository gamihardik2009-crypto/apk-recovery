package W1;

import J.C0257c;
import J.C0285q;
import a.AbstractC0423a;
import i0.C0712e;
import m2.C0880v;

/* renamed from: W1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0380a implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6006i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6007j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6008k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6009l;

    public /* synthetic */ C0380a(C0712e c0712e, String str, y2.a aVar, int i2) {
        this.f6005h = 2;
        this.f6008k = c0712e;
        this.f6009l = str;
        this.f6006i = aVar;
        this.f6007j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f6005h;
        C0285q c0285q = (C0285q) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                P p3 = (P) this.f6008k;
                z2.h.f(p3, "$viewModel");
                y2.a aVar = (y2.a) this.f6006i;
                z2.h.f(aVar, "$onDismiss");
                y2.a aVar2 = (y2.a) this.f6009l;
                z2.h.f(aVar2, "$onImport");
                AbstractC0423a.h(p3, aVar, aVar2, c0285q, C0257c.Y(this.f6007j | 1));
                break;
            case 1:
                y2.a aVar3 = (y2.a) this.f6006i;
                z2.h.f(aVar3, "$onDismiss");
                y2.f fVar = (y2.f) this.f6009l;
                z2.h.f(fVar, "$onSave");
                AbstractC0423a.e((R1.b) this.f6008k, aVar3, fVar, c0285q, C0257c.Y(this.f6007j | 1));
                break;
            case 2:
                C0712e c0712e = (C0712e) this.f6008k;
                z2.h.f(c0712e, "$icon");
                String str = (String) this.f6009l;
                z2.h.f(str, "$label");
                y2.a aVar4 = (y2.a) this.f6006i;
                z2.h.f(aVar4, "$onClick");
                AbstractC0423a.j(c0712e, str, aVar4, c0285q, C0257c.Y(this.f6007j | 1));
                break;
            case 3:
                R1.b bVar = (R1.b) this.f6008k;
                z2.h.f(bVar, "$client");
                y2.a aVar5 = (y2.a) this.f6006i;
                z2.h.f(aVar5, "$onEdit");
                y2.a aVar6 = (y2.a) this.f6009l;
                z2.h.f(aVar6, "$onDelete");
                AbstractC0423a.f(bVar, aVar5, aVar6, c0285q, C0257c.Y(this.f6007j | 1));
                break;
            case 4:
                String str2 = (String) this.f6008k;
                z2.h.f(str2, "$clientName");
                String str3 = (String) this.f6006i;
                z2.h.f(str3, "$status");
                String str4 = (String) this.f6009l;
                z2.h.f(str4, "$time");
                C1.y.a(str2, str3, str4, c0285q, C0257c.Y(this.f6007j | 1));
                break;
            default:
                y2.a aVar7 = (y2.a) this.f6006i;
                z2.h.f(aVar7, "$onDismiss");
                y2.f fVar2 = (y2.f) this.f6009l;
                z2.h.f(fVar2, "$onSave");
                K1.f.a((R1.e) this.f6008k, aVar7, fVar2, c0285q, C0257c.Y(this.f6007j | 1));
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0380a(Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.f6005h = i3;
        this.f6008k = obj;
        this.f6006i = obj2;
        this.f6009l = obj3;
        this.f6007j = i2;
    }
}
