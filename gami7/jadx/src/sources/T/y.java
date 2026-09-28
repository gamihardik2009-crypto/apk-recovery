package T;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements Map.Entry, A2.d {

    /* renamed from: h, reason: collision with root package name */
    public final Object f5761h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5762i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f5763j;

    public y(z zVar) {
        this.f5763j = zVar;
        Map.Entry entry = zVar.f5767k;
        z2.h.c(entry);
        this.f5761h = entry.getKey();
        Map.Entry entry2 = zVar.f5767k;
        z2.h.c(entry2);
        this.f5762i = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5761h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5762i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        z zVar = this.f5763j;
        if (zVar.f5764h.f().f5729d != zVar.f5766j) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f5762i;
        zVar.f5764h.put(this.f5761h, obj);
        this.f5762i = obj;
        return obj2;
    }
}
