package E0;

import a.AbstractC0423a;
import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class d extends AbstractC0423a {

    /* renamed from: g, reason: collision with root package name */
    public final BreakIterator f1019g;

    public d(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f1019g = characterInstance;
    }

    @Override // a.AbstractC0423a
    public final int T(int i2) {
        return this.f1019g.following(i2);
    }

    @Override // a.AbstractC0423a
    public final int U(int i2) {
        return this.f1019g.preceding(i2);
    }
}
