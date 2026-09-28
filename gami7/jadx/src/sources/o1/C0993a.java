package o1;

import androidx.lifecycle.N;
import androidx.lifecycle.X;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993a extends X {

    /* renamed from: b, reason: collision with root package name */
    public final String f9231b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final UUID f9232c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f9233d;

    public C0993a(N n3) {
        Object obj;
        LinkedHashMap linkedHashMap = n3.f6848a;
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            B1.t.w(n3.f6850c.remove("SaveableStateHolder_BackStackEntryKey"));
            n3.f6851d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            n3.b(uuid, this.f9231b);
        }
        this.f9232c = uuid;
    }

    @Override // androidx.lifecycle.X
    public final void d() {
        WeakReference weakReference = this.f9233d;
        if (weakReference == null) {
            z2.h.j("saveableStateHolderRef");
            throw null;
        }
        S.c cVar = (S.c) weakReference.get();
        if (cVar != null) {
            cVar.b(this.f9232c);
        }
        WeakReference weakReference2 = this.f9233d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            z2.h.j("saveableStateHolderRef");
            throw null;
        }
    }
}
