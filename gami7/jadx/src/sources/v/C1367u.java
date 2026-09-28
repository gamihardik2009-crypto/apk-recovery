package v;

import java.util.Comparator;
import n2.AbstractC0960l;

/* renamed from: v.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f11390b;

    public /* synthetic */ C1367u(z zVar, int i2) {
        this.f11389a = i2;
        this.f11390b = zVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11389a) {
            case 0:
                Object key = ((InterfaceC1330B) obj).getKey();
                z zVar = this.f11390b;
                return AbstractC0960l.g(Integer.valueOf(zVar.c(key)), Integer.valueOf(zVar.c(((InterfaceC1330B) obj2).getKey())));
            case 1:
                Object key2 = ((InterfaceC1330B) obj).getKey();
                z zVar2 = this.f11390b;
                return AbstractC0960l.g(Integer.valueOf(zVar2.c(key2)), Integer.valueOf(zVar2.c(((InterfaceC1330B) obj2).getKey())));
            case 2:
                Object key3 = ((InterfaceC1330B) obj2).getKey();
                z zVar3 = this.f11390b;
                return AbstractC0960l.g(Integer.valueOf(zVar3.c(key3)), Integer.valueOf(zVar3.c(((InterfaceC1330B) obj).getKey())));
            default:
                Object key4 = ((InterfaceC1330B) obj2).getKey();
                z zVar4 = this.f11390b;
                return AbstractC0960l.g(Integer.valueOf(zVar4.c(key4)), Integer.valueOf(zVar4.c(((InterfaceC1330B) obj).getKey())));
        }
    }
}
