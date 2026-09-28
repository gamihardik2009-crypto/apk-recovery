package u1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import z2.h;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324a implements InterfaceC1327d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11258a;

    public C1324a(e eVar) {
        h.f(eVar, "registry");
        this.f11258a = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // u1.InterfaceC1327d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f11258a));
        return bundle;
    }
}
