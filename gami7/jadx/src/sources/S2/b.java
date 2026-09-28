package S2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;

/* loaded from: classes.dex */
public final class b extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5622i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f5623j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f5624k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i2) {
        super(1);
        this.f5622i = i2;
        this.f5623j = dVar;
        this.f5624k = cVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f5622i) {
            case 0:
                this.f5623j.d(this.f5624k.f5626i);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f5628h;
                c cVar = this.f5624k;
                Object obj2 = cVar.f5626i;
                d dVar = this.f5623j;
                atomicReferenceFieldUpdater.set(dVar, obj2);
                dVar.d(cVar.f5626i);
                break;
        }
        return C0880v.f8657a;
    }
}
